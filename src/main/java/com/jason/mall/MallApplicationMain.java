package com.jason.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = {"com.jason.mall.dao","com.jason.mall.mbg"})
public class MallApplicationMain {

    public static void main(String[] args){
        SpringApplication.run(MallApplicationMain.class,args);
    }
}
