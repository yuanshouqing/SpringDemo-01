package com.test.study.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kindy
 * @Description:rabbitMQ  消息转换为json格式发送
 * @date
 */
@Configuration
public class MyAMQPConfig {


    @Bean
    public MessageConverter   messageConverter(){
        return   new Jackson2JsonMessageConverter();

    }
}
