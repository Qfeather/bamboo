package com.bamboo.dao;

import com.bamboo.entity.Photoes.Photo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("Photo")
public interface IPhotoDAO {
    public int newPhoto(Photo photo);
    public int delphoto(String pno);
    public int del(Map map);//删除个人发布的图片
    public List<Photo> searchphoto(String des);
}
