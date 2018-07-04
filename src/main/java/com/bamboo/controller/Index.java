package com.bamboo.controller;

import com.bamboo.entity.users.User;
import com.bamboo.service.impl.CollectionServiceImpl;
import com.bamboo.service.impl.UserServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("hello")
public class Index {

    @Resource(name = "userservice")
    private UserServicesImpl userServices;

    @Resource(name = "collectionservice")
    private CollectionServiceImpl collectionService;
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getRequest(@RequestParam("username") String username,
                             @RequestParam("password") String password,Model model){
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        if(userServices.login(username, password)){
            User user=userServices.getUser(username);
            List<String> collphoto=collectionService.allphoto(user.getUno());
            model.addAttribute("user",user);
            model.addAttribute("photo",collphoto);
            return "personal";
        }else{
            return "wrong";
        }
    }


    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    @ResponseBody
    public String register(@RequestParam("username") String username,
                      @RequestParam("password") String password,
                      @RequestParam("name") String name,
                      @RequestParam("sex") String sex,
                      @RequestParam("age") int age,
                      @RequestParam("tel") String tel,Model model){
        String tname=null;
        String tsex=null;
        try {
            tname=new String(name.trim().getBytes("ISO-8859-1"), "UTF-8");
            tsex=new String(sex.trim().getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        User user=new User();
        user.setUno();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(tname);
        user.setSex(tsex);
        user.setAge(age);
        user.setRegdate();
        user.setTel(tel);
        boolean flag=userServices.register(user);
        if (flag){
            return "success";
        }else {
            return "false";
        }
    }

}

