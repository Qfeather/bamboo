package com.bamboo.service.impl;

import com.bamboo.dao.ILeaveMessageDAO;
import com.bamboo.entity.comments.Comment;
import com.bamboo.entity.comments.Lmessage;
import com.bamboo.service.CommentService;

public class CommentServiceImpl implements CommentService {

    //给图片留言
    private ILeaveMessageDAO lmdao;
    public boolean newleave(String pno,String uno,String lmcontent){
        Lmessage lmessage=new Lmessage();
        lmessage.setLmno();
        lmessage.setPhno(pno);
        lmessage.setLmcontent(lmcontent);
        lmessage.setUuno(uno);
        lmessage.setLmdate();
        int i=lmdao.leavemessage(lmessage);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    //给留言回复

    public boolean newComment(String fcno,String content,String uno){//被评论的留言或评论,你的评论，你的编号，被评论留言
        Comment comment=new Comment();
        comment.setScno();
        comment.setFcno(fcno);
        comment.setContent(content);
        comment.setUuno(uno);
        comment.setCdate();
        comment.setLlmno(fcno);
        int i=lmdao.newcontent(comment);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    //给回复回复
    public boolean newContent(String fcno,String content,String uno){//被评论的留言或评论,你的评论，你的编号，被评论留言
        Comment comment=new Comment();
        comment.setScno();
        comment.setFcno(fcno);
        //根据fcno找到回复人
        String user=lmdao.selectupuser(fcno);
        comment.setContent("回复@"+user+content);
        comment.setUuno(uno);
        comment.setCdate();
        String lmno=lmdao.selectup(fcno);//根据fcno找到位于哪一个留言下
        comment.setLlmno(lmno);
        int i=lmdao.newcontent(comment);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }


}
