package com.lq.controller;

import com.lq.entity.Emp;
import com.lq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("findAll")
    public String findAll(HttpServletRequest request) {
        List<Emp> emps = empService.findAll();
        request.setAttribute("emps", emps);
        return "emplist";
    }
}
