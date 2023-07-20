package com.canny.cannycraftboard.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class Test {
    private Integer id;
    private String test;
}
