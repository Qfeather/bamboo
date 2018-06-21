package com.bamboo.service;

import com.bamboo.entity.users.User;

public interface UserService {
    public boolean login(String username,String password);
    public boolean register(User user);
    public boolean update(User user);

}
