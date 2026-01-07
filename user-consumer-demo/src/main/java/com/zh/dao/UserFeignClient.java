package com.zh.dao;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.zh.pojo.User;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/7 9:24
 */
@FeignClient(value = "user-service", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
