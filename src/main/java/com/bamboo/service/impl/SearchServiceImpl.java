package com.bamboo.service.impl;

import com.bamboo.dao.IPhotoDAO;
import com.bamboo.dao.IUserDAO;
import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.users.User;
import com.bamboo.service.SearchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("searchservice")
public class SearchServiceImpl implements SearchService {

    private IPhotoDAO pdao;
    private IUserDAO udao;
    //查找图片
    public List<Photo> searchPhoto(String search){
        List<Photo> list=pdao.searchphoto(search);
        return list;
    }
    //查找用户
    public List<User> searchUser(String search){
        List<User> list= udao.searchuser(search);
        return list;
    }

}
