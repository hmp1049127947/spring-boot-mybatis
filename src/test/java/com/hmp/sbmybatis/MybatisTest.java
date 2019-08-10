package com.hmp.sbmybatis;

import com.hmp.sbmybatis.dao.UserDao;
import com.hmp.sbmybatis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 黄明潘
 * @date 2019/8/10-16:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SbMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void test() {
        List<User> users = userDao.findAll();
        System.out.println(users);
    }
}
