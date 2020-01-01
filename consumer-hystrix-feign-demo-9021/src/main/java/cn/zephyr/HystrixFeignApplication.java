package cn.zephyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: HystrixFeignApplication
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/31 20:45
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class HystrixFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignApplication.class,args);
    }
}
