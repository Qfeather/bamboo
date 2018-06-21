package com.bamboo.service.impl;

import com.bamboo.dao.PLUDAO;
import com.bamboo.service.RecommendService;

import java.util.List;

public class RecommendServiceImpl implements RecommendService {

    private PLUDAO pludao;
    //推荐用户
    public List<String> recommUser(String label){
        List<String> list =pludao.recommenduser(label);
        return list;
    }
//    //推荐图片
//    public List<Photo> recommPhoto(String label){
//
//    }
}
