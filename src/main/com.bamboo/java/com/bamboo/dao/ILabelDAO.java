package com.bamboo.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("label")
public interface ILabelDAO {
    public String findLabel(String lname);
    public int insertLabel(Map map);
}
