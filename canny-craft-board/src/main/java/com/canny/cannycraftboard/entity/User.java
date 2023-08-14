package com.canny.cannycraftboard.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private String id;
    private String username;
    private String password;
    private String salt;
    private String createTime;
    private Integer useful;
    private Integer role;
}