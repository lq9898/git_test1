package com.lq.impl;

import com.lq.dao.UserDao;
import com.lq.entity.User;
import com.lq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        userDao.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean login(String username, String password) {
        User user = userDao.queryUsernameByPwd(username, password);
        if (user != null) {
            return true;
        }
        return false;
    }
}
