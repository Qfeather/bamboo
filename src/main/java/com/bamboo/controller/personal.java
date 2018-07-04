package com.bamboo.controller;

import com.bamboo.service.impl.CollectionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("per")
public class personal {

    @Resource(name = "collectionservice")
    private CollectionServiceImpl services;


    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String getRequest(@RequestParam("username") String username,
                             @RequestParam("password") String password,Model model){
        return null;


    }




}

