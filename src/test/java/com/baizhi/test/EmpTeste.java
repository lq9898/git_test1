package com.baizhi.test;

import com.lq.entity.Emp;
import com.lq.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpTeste extends AbTest {
    @Autowired
    private EmpService empService;

    @Test
    public void queryAll() {
        List<Emp> emps = empService.findAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
