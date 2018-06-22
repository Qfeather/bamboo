package com.bamboo.service;

import com.bamboo.entity.Photoes.Photo;

public interface PhotoService {
    //收藏照片
    public boolean collectionPhoto(String uno,String pno,String ckname);
    //上传照片
    public boolean upload(Photo photo);
}
