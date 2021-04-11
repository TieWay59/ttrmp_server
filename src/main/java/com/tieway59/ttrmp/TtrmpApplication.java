package com.tieway59.ttrmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tieway59.ttrmp.mapper")
public class TtrmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtrmpApplication.class, args);
    }

}
