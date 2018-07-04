package com.bamboo.service.impl;

import com.bamboo.dao.IUserDAO;
import com.bamboo.entity.users.User;
import com.bamboo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userservice")
public class UserServicesImpl implements UserService {

    @Resource(name = "userdao")
    private IUserDAO userDAO;

    @Override
    public boolean login(String username, String password) {
        String truepass = userDAO.findByusername(username);
        if(password.equals(truepass)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean register(User user) {
        int i=userDAO.newUser(user);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean update(User user) {
        int i=userDAO.upd(user);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User getUser(String username) {
        User user=userDAO.findoneuser(username);
        return user;
    }

}
