package com.bamboo.service;

import java.util.List;

public interface CollectionService {
    //展示所有收藏夹内图片（最大九张）
    public List<String> allphoto(String uno);
    //删除图片
    public boolean del();
    //收藏夹内添加图片
    public boolean insert();
}
