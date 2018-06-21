package com.bamboo.dao;

import com.bamboo.entity.users.UserPersonalLike;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("plu")
public interface PLUDAO {
    public int insertlike(UserPersonalLike userPersonalLike);//插入userlike表
    public int insertpersonal(UserPersonalLike userPersonalLike);//插入userpersonal表

    public List<String> selectlike(String user);//查询userlike表中用户喜爱的标签
    public List<String> selectpersonal(String user);//查询用户个人标签
}
