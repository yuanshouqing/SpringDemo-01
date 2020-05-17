package com.test.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Kindy
 * @Description:
 * @date
 */

@MapperScan(value = "com.test.study.mapper")
@SpringBootApplication
@EnableRabbit   //开启基于注解的RabbitMQ
//@EnableCaching
public class SpringBootTestMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestMain.class,args);
        System.out.println("启动成功============");
    }
}
