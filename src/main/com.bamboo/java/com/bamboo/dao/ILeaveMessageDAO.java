package com.bamboo.dao;


import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.comments.Comment;
import com.bamboo.entity.comments.Lmessage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("LMessageDao")
public interface ILeaveMessageDAO {

//    图片对应留言
    public List<Photo> pcontent(String pno);
//    图片对应留言+评论
    public List<Photo> findALL(String pno);
    //新留言
    public int leavemessage(Lmessage lmessage);
//    新评论
    public int newcontent(Comment comment);
    //根据子评论的fcno找到父评论位于哪一个留言下
    public String selectup(String fcno);
    public String selectupuser(String fcno);
}
