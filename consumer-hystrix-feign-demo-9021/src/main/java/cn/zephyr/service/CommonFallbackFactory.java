package cn.zephyr.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CommonFallbackFactory
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/1/1 17:41
 */
@Component
public class CommonFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        throwable.printStackTrace();
        throw new RuntimeException("service not available");
    }
}
