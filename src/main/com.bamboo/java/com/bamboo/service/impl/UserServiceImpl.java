package com.bamboo.service.impl;

import com.bamboo.dao.IUserDAO;
import com.bamboo.entity.users.User;
import com.bamboo.service.UserService;

public class UserServiceImpl implements UserService {
    private IUserDAO dao;
    //登录
    public boolean login(String username,String password){
        String truepass=dao.findByusername(username);
        if(password.equals(truepass)){
            return true;
        }else {
            return false;
        }
    }
    //注册
    public boolean register(User user){
        int i=dao.newUser(user);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    //修改信息
    public boolean update(User user){
        int i=dao.upd(user);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


}
