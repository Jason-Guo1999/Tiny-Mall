package com.jason.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.jason.mall.dao","com.jason.mall.mbg.mapper"})
public class MybatisConfig {

}
