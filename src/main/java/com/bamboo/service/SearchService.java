package com.bamboo.service;

import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.users.User;

import java.util.List;

public interface SearchService {
    public List<User> searchUser(String search);//查找用户
    public List<Photo> searchPhoto(String search);//查找图片
}
