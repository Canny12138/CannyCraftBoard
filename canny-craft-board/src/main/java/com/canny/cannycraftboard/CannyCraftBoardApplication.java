package com.canny.cannycraftboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.canny.cannycraftboard.mapper")
//@MapperScan("com.canny.cannycraftboard.controller")
public class CannyCraftBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CannyCraftBoardApplication.class, args);
	}

}
