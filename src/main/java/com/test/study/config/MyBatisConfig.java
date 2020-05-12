package com.test.study.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;


/**
 * @author Kindy
 * @Description:当数据库是xxx_xxx的命名方式，而对象是驼峰，则可以添加该配置
 * @date
 */
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
    @Bean
    public ConfigurationCustomizer  configurationCustomizer(){
      return   new ConfigurationCustomizer(){

            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);

            }
        };
    }
}
