package com.bamboo.service;

import com.bamboo.entity.users.Fans;

import java.util.List;

public interface FanService {
    //展示关注人
    public List<Fans> disattention(String user);
    //展示粉丝
    public List<Fans> disfans(String user);
    //关注
    public boolean attention(String user,String fans);
    //取关
    public boolean unattention(String user,String fans);
}
