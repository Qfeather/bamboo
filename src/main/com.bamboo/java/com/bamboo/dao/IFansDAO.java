package com.bamboo.dao;


import com.bamboo.entity.users.Fans;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fans")
public interface IFansDAO {
//    查找粉丝
    public List<Fans> selectfans(String users);
//    查找关注人
    public List<Fans> selectatten(String users);

}
