package com.bamboo.service;

import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.users.User;

import java.util.List;

public interface RecommendService {
    //推荐用户
    public List<User> recommUser(String uno);
    //推荐图片
    public List<Photo> recommPhoto(String uno);
}
