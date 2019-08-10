package com.hmp.sbmybatis.dao;

import com.hmp.sbmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 黄明潘
 * @date 2019/8/10-15:37
 */
@Mapper
@Repository
public interface UserDao {
    List<User> findAll();
}
