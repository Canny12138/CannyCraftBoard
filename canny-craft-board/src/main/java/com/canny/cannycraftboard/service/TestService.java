package com.canny.cannycraftboard.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canny.cannycraftboard.entity.Test;
import com.canny.cannycraftboard.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, Test> {
}
