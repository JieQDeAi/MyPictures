package com.example.mypic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mypic.mapper")
public class MyPicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPicApplication.class, args);
    }

}
