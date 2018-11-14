package com.lq.controller;

import com.lq.entity.User;
import com.lq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("User")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("register")
    public String register(User user) {
        userService.register(user);
        return "redirect:/login.jsp";
    }

    @RequestMapping("login")
    public String login(String username, String password) {
        boolean user = userService.login(username, password);
        if (user) {
            return "";
        }
        return "login";

    }

}
