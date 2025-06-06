package com.aqinghz.smartreserve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.aqinghz.smartreserve.mapper") // 扫描 MyBatis Mapper 接口所在的包
public class SmartReserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartReserveApplication.class, args);
    }

}
