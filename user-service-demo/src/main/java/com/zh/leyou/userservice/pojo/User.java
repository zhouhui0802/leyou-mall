package com.zh.leyou.userservice.pojo;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/6 14:11
 */
@Table(name = "tb_user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private LocalDateTime birthday;

    // 创建时间
    private LocalDateTime created;

    // 更新时间
    private LocalDateTime updated;

    // 备注
    private String note;
}
