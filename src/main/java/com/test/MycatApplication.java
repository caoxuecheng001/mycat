package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName : MycatApplication
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-02-14 19:21
 */

@SpringBootApplication
@MapperScan("com.test.mapper")
public class MycatApplication {
    public static void main(String[] args) {
        SpringApplication.run(MycatApplication.class,args);
    }
}
