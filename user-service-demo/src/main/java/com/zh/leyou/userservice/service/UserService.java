package com.zh.leyou.userservice.service;


import com.zh.leyou.userservice.mapper.UserMapper;
import com.zh.leyou.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/6 14:17
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
