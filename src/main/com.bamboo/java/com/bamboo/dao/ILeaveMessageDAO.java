package com.bamboo.dao;


import com.bamboo.entity.Photoes.Photo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("LMessageDao")
public interface ILeaveMessageDAO {

    public List<Photo> pcontent(String pno);

}
