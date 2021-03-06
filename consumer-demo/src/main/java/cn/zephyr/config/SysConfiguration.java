package cn.zephyr.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: SysConfiguration
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/12 19:55
 */
@Configuration
public class SysConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
//    @Bean
//    @Qualifier("rt1")
//    public RestTemplate rt1(){
//        return new RestTemplate();
//    }
//    @Bean
//    @LoadBalanced
//    @Qualifier("rt2")
//    public RestTemplate rt2(){
//        return new RestTemplate();
//    }
}
