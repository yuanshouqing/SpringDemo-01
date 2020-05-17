package com.test.study.service;

import com.test.study.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author Kindy
 * @Description:
 * @date
 */
@Service
public class BookService {

    //监听改队列，如果要使这个起作用需要在主启动类中添加@EnableRabbit
    @RabbitListener(queues = "atguigu.news")
    public    void   receive(Book  book){
        System.out.println("收到消息："+book);
    }


    @RabbitListener(queues = "atguigu")
    public   void  receive02(Message  message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
