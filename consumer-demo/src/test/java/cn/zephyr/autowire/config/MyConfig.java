package cn.zephyr.autowire.config;

import cn.zephyr.autowire.anno.Anno1;
import cn.zephyr.autowire.anno.Anno2;
import cn.zephyr.autowire.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyConfig
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/23 17:22
 */
@Configuration
public class MyConfig {

    @Bean
    @Anno1
    public MyService ms11(){
        return new MyService();
    }
    @Bean
    @Anno1
    public MyService ms12(){
        return new MyService();
    }
    @Bean
    @Anno2
    public MyService ms21(){
        return new MyService();
    }
    @Bean
    @Anno2
    public MyService ms22(){
        return new MyService();
    }
    @Bean
    @Anno2
    public MyService ms23(){
        return new MyService();
    }
    @Bean
    public MyService ms01(){
        return new MyService();
    }
    @Bean
    public MyService ms02(){
        return new MyService();
    }
}
