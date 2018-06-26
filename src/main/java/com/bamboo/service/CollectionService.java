package com.bamboo.service;

import java.util.List;

public interface CollectionService {
    //展示该用户所有收藏夹
    public List<String> displayCollection(String name);
    //查找特定收藏夹下的图片
    public List<String> displayimg(String name,String ckname);
    //删除收藏夹下的对应图片
    public boolean del(String uno,String pno,String ckname);
}
