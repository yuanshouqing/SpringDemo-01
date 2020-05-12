package com.test.study.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kindy
 * @Description:
 * @date
 */
//使用JPA注解配置映射关系
@Entity//告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "tb1_user")//@Table来指定和哪个数据表对应；如果省略默认表名就是user
@Data
public class User {

    @Id//这是一个逐渐
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增逐渐
    private  Integer  id;
    @Column(name = "last_name",length = 50)//这是和数据表对应的一个列
    private String  lastName;
    @Column    //省略默认列名就是属性名
    private String  email;
}
