package com.bamboo.service.impl;

import com.bamboo.dao.ICollectionDAO;
import com.bamboo.dao.ILeaveMessageDAO;
import com.bamboo.dao.IPhotoDAO;
import com.bamboo.entity.Photoes.Photo;
import com.bamboo.service.PhotoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("phootservice")
public class PhotoServiceImpl implements PhotoService {
    //上传照片
    private IPhotoDAO pdao;
    private ICollectionDAO cdao;
    private ILeaveMessageDAO lmdao;
    public boolean upload(Photo photo){
        int i=pdao.newPhoto(photo);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    //收藏照片
    public boolean collectionPhoto(String uno,String pno,String ckname){
        Photo photo=pdao.findonephoto("1");
        photo.addCollnum();//收藏数自加
        int i=pdao.updatephoto(photo);
        //添加该图片至特定收藏夹
        com.bamboo.entity.users.Collection  collection=new com.bamboo.entity.users.Collection();
        collection.setUno(uno);
        collection.setPpno(pno);
        collection.setCdate();
        collection.setCkname(ckname);
        int j=cdao.insertnewphoto(collection);
        if(i>0&&j>0){
            return true;
        }else {
            return false;
        }
    }
    //展示photo，留言，评论
    public List<Photo> displayAll(String pno){
        List<Photo> list=lmdao.findALL(pno);
        return list;
    }

}
