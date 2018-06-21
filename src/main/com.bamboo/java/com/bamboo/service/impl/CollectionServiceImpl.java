package com.bamboo.service.impl;

import com.bamboo.dao.ICollectionDAO;
import com.bamboo.service.CollectionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionServiceImpl implements CollectionService {

    private ICollectionDAO dao;
    //查找改用户的所有收藏夹
    public List<String> displayCollection(String name){
        List<String> list=dao.findckname(name);
        return list;
    }
    //查找特定收藏夹下的图片
    public List<String> displayimg(String name,String ckname){
        Map<String,String> map=new HashMap<String,String>();
        map.put("uno",name);
        map.put("ckname",ckname);
        List<String> list=dao.findimg(map);
        return list;
    }
    //删除收藏夹下的对应图片
    public boolean del(String uno,String pno,String ckname){
        Map<String,String> map=new HashMap<String,String>();
        map.put("uno",uno);
        map.put("pno",pno);
        map.put("ckname",ckname);
        int i=dao.del(map);
        if (i > 0) {
            return true;
        }else {
            return false;
        }
    }

}
