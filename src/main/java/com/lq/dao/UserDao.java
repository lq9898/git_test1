package com.lq.dao;

import com.lq.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    void insert(User user);

    User queryUsernameByPwd(@Param("username") String username, @Param("password") String password);
}
