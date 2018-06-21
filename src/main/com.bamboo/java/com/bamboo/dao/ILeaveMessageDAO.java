package com.bamboo.dao;


import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.comments.Comment;
import com.bamboo.entity.comments.Lmessage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("LMessageDao")
public interface ILeaveMessageDAO {

    public List<Photo> pcontent(String pno);
    public List<Photo> findALL(String pno);
    //新留言
    public int leavemessage(Lmessage lmessage);

    public int newcontent(Comment comment);

}
