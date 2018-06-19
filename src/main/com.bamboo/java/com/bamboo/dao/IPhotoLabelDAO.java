package com.bamboo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("IPLDao")
public interface IPhotoLabelDAO {
    public List<String> plabel(String pno);
    public List<String> labelp(String lno);
}
