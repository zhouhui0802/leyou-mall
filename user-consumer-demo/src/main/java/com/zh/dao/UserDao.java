package com.zh.dao;



import com.zh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/6 14:40
 */
@Component
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;


    public User queryUserById(Long id){
        String url = "http://localhost:8081/user/" + id;
        return this.restTemplate.getForObject(url, User.class);
    }
}
