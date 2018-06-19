package com.bamboo.dao;

import com.bamboo.entity.Photoes.Photo;
import org.springframework.stereotype.Repository;

@Repository("Photo")
public interface IPhotoDAO {
    public int newPhoto(Photo photo);
    public int delphoto(String pno);

}
