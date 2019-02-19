package com.sk.zl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.sk.zl.mybatis.mapper")
@EnableSwagger2
@SpringBootApplication
public class ZlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZlApplication.class, args);
	}
}

