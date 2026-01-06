package com.zh.controller;


import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zh.pojo.User;
import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/6 14:45
 */
@RestController
@RequestMapping("consume")
public class ConsumerController {

    @Autowired
    private UserService userConsumerService;

    @GetMapping
    public List<User> consume(@RequestParam("ids") List<Long> ids) {
        return this.userConsumerService.querUserByIds(ids);
    }
    //URL访问方式： http://localhost:8080/consume?ids=6,7,8
}
