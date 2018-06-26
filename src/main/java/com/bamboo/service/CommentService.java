package com.bamboo.service;

public interface CommentService {
    //给图片留言
    public boolean newleave(String pno,String uno,String lmcontent);
    //给留言回复
    public boolean newComment(String fcno,String content,String uno);
    //给回复回复
    public boolean newContent(String fcno,String content,String uno);
}