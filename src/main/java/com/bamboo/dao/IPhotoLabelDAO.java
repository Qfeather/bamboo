package com.bamboo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("IPLDao")
public interface IPhotoLabelDAO {
    public List<String> plabel(String pno);
    public List<String> labelp(String lno);
    public int insertpl(Map map);
}
