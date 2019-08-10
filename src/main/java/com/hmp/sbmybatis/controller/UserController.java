package com.hmp.sbmybatis.controller;

import com.hmp.sbmybatis.dao.UserDao;
import com.hmp.sbmybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 黄明潘
 * @date 2019/8/10-16:16
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/query")
    @ResponseBody
    public List<User> queryAll() {
        return userDao.findAll();
    }
}
