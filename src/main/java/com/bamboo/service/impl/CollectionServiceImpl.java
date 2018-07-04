package com.bamboo.service.impl;

import com.bamboo.dao.ICollectionDAO;
import com.bamboo.service.CollectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("collectionservice")
public class CollectionServiceImpl implements CollectionService {

    @Resource(name="CollectDao")
    private ICollectionDAO dao;
    @Override
    public List<String> allphoto(String uno) {
        List<String> strings=dao.findimg(uno);
        return strings;
    }

    @Override
    public boolean del() {
        return false;
    }

    @Override
    public boolean insert() {
        return false;
    }
}
