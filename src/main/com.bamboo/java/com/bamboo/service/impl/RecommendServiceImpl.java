package com.bamboo.service.impl;

import com.bamboo.dao.IPhotoDAO;
import com.bamboo.dao.IPhotoLabelDAO;
import com.bamboo.dao.IUserDAO;
import com.bamboo.dao.PLUDAO;
import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.users.User;
import com.bamboo.service.RecommendService;

import java.util.LinkedList;
import java.util.List;

public class RecommendServiceImpl implements RecommendService {

    private PLUDAO pludao;
    private IPhotoLabelDAO photoLabeldao;
    private IPhotoDAO pdao;
    private IUserDAO userdao;
    //推荐用户
    public List<User> recommUser(String uno){
        String label=pludao.selectonlylike(uno);//找到用户最喜爱标签
        List<String> list=pludao.recommenduser(label);//根据最喜爱标签在personallike表中查找对应的用户的编号
        List<User> users=new LinkedList<User>();
        for (String s:list) {
            users.add(userdao.findOne(s));//根据用户编号查找用户
        }
        return users;
    }
    //推荐图片
    public List<Photo> recommPhoto(String uno){
        String label=pludao.selectonlylike(uno);//找到用户最喜爱标签
        List<String> list=photoLabeldao.labelp(label);
        List<Photo> photos=new LinkedList<Photo>();
        for (String s: list) {
            photos.add(pdao.findonephoto(s));
        }
        return photos;
    }
}
