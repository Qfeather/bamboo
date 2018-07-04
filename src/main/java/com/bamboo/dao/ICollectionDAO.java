package com.bamboo.dao;

import com.bamboo.entity.users.Collection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("CollectDao")
public interface ICollectionDAO {
    //根据用户名查找收藏夹下图片
    public List<String> findimg(String uno);
    //删除收藏夹下的对应图片
    public int del(Map map);
    //收藏夹添加图片
    public int insertnewphoto(Collection collection);

}
