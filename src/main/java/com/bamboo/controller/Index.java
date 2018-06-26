package com.bamboo.controller;

import com.bamboo.service.impl.UserServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("hello")
public class Index {

    @Resource(name = "userservice")
    private UserServicesImpl userServices;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getRequest(@RequestParam("username") String username,
                             @RequestParam("password") String password,Model model){
        System.out.println("success1");
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        System.out.println("success2");
        if(userServices.login(username, password)){
            System.out.println("success3");
            return "home";
        }else{
            return "wrong";
        }
    }

}

