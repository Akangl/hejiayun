package com.study.family_service_platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wenkang.Zhou
 * @date 2021-05-14
 */

@SpringBootApplication
@MapperScan
public class FamilyServicePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(FamilyServicePlatformApplication.class, args);
    }
}
