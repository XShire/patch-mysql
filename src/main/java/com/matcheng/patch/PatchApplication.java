package com.matcheng.patch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.matcheng.patch.mapper")
public class PatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatchApplication.class, args);
    }
}
