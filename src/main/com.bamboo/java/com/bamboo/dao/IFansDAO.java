package com.bamboo.dao;


import com.bamboo.entity.users.Fans;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("fans")
public interface IFansDAO {
//    查找粉丝
    public List<Fans> selectfans(String users);
//    查找关注人
    public List<Fans> selectatten(String users);

    public int insertatten(Map map);//关注

    public int delattention(Map map);//取关

}
