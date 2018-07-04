package com.bamboo.dao;

import com.bamboo.entity.users.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userdao")
public interface IUserDAO {

    public String findByusername(String username);
    //根据用户名查询密码做登录使用，查不到密码则用户不存在
    public User findAll(String username);
    public User findOne(String username);

    public User findoneuser(String username);
    public String getuno(String username);

    public int newUser(User user);
    public int upd(User user);

    public List<User> searchuser(String name);
}
