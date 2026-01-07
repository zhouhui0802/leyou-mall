package com.zh.leyou.userservice.service;


import com.zh.leyou.userservice.mapper.UserMapper;
import com.zh.leyou.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

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

    public User queryById(Long id) throws InterruptedException{

        // 为了演示超时现象，我们在这里然线程休眠,时间随机 0~2000毫秒
        //Thread.sleep(new Random().nextInt(7000));

        return this.userMapper.selectByPrimaryKey(id);
    }
}
