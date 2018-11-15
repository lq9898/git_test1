package com.lq.dao;

import com.lq.entity.Emp;

import java.util.List;

public interface EmpDao {
    void insert(Emp emp);

    void delete(int id);

    void update(Emp emp);

    List<Emp> queryAll();
}
