package com.bamboo.service.impl;

import com.bamboo.dao.IFansDAO;
import com.bamboo.entity.users.Fans;
import com.bamboo.service.FanService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("fanservice")
public class FanServiceImpl implements FanService {

    private IFansDAO dao;
    //展示关注人
    public List<Fans> disattention(String user){
        List<Fans> list=dao.selectatten(user);
        return list;
    }
    //展示粉丝
    public List<Fans> disfans(String user){
        List<Fans> list=dao.selectfans(user);
        return list;
    }
    //关注
    public boolean attention(String user,String fans){
        Map<String,String> map=new HashMap<String,String>();
        map.put("user",user);//要关注的人
        map.put("fans",fans);//你自己
        int i=dao.insertatten(map);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
    //取关
    public boolean unattention(String user,String fans){
        Map<String,String> map=new HashMap<String,String>();
        map.put("user",user);//要取关的人
        map.put("fans",fans);//你自己
        int i=dao.delattention(map);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
