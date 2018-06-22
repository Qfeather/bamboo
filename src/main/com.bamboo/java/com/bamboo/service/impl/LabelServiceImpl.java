package com.bamboo.service.impl;

import com.bamboo.dao.ILabelDAO;
import com.bamboo.dao.IPhotoLabelDAO;
import com.bamboo.entity.Label;
import com.bamboo.service.LabelService;

import java.util.HashMap;
import java.util.Map;

public class LabelServiceImpl implements LabelService {

    private ILabelDAO labeldao;
    private IPhotoLabelDAO pdao;
    //贴标签
    public boolean addLabel(String pno,String lname){
        boolean flag=false;
        //遍历数据库查找是否有该标签，若无加入标签表，若有得到对应标签编号，加入照片标签表，成功返回true失败返回false
        if(labeldao.findLabel(lname)==null){
            Map<String,String> map=new HashMap<String,String>();
            String lno=new Label().setStringLno();
            map.put("pno",pno);
            map.put("lno",lno);
            int i=labeldao.insertLabel(map);//在标签表插入新标签
        }
        String lno=labeldao.findLabel(lname);
        Map<String,String> map=new HashMap<String,String>();
        map.put("pno",pno);
        map.put("lno",lno);
        int i=pdao.insertpl(map);//插入photolabel表中
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    //删除标签


}
