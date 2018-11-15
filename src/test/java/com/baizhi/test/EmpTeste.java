package com.baizhi.test;

import com.lq.entity.Emp;
import com.lq.entity.User;
import com.lq.service.EmpService;
import com.lq.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpTeste extends AbTest {
    @Autowired
    private EmpService empService;
    @Autowired
    private UserService userService;

    @Test
    public void queryAll() {
        List<Emp> emps = empService.findAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void insert() {
        User user = new User();
        user.setRealname("leiqin");
        user.setRealname("lq");
        user.setPassword("123456");
        user.setSex("nv");
        userService.register(user);
    }
}
