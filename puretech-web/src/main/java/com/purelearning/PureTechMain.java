package com.purelearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * 自动扫描com.purelearning包及其子包中的组件
 */
@SpringBootApplication
public class PureTechMain {
    public static void main( String[] args ) {
        SpringApplication.run(PureTechMain.class, args);
    }
}