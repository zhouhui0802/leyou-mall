package com.zh.dao;


import com.zh.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/7 9:39
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
