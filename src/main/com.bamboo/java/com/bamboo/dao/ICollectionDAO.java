package com.bamboo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("CollectDao")
public interface ICollectionDAO {
    public List<String> findckname(String username);//根据用户名查找对应收藏夹名字
    //根据收藏夹名字和用户名查找收藏夹下图片
    public List<String> findimg(Map map);

}
