package com.bamboo.service;

import com.bamboo.entity.users.User;

public interface UserService {
    //登录
    public boolean login(String username,String password);
    //注册
    public boolean register(User user);
    //更改
    public boolean update(User user);

}
