package cn.zephyr.config;

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
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
