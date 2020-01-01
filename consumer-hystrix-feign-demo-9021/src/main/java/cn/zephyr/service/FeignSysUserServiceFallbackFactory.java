package cn.zephyr.service;

import cn.zephyr.entity.SysUser;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: FeignSysUserServiceFallbackFactory
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/1/1 17:16
 */
@Component
public class FeignSysUserServiceFallbackFactory implements FallbackFactory<FeignSysUserService> {
    @Override
    public FeignSysUserService create(Throwable throwable) {
        return new FeignSysUserService() {
            @Override
            public SysUser selectById(Integer id) {
                System.err.println("hystrix fallback method");
                return new SysUser("user not available");
            }

            @Override
            public SysUser selectById4Get(Integer id) {
                System.err.println("hystrix fallback method");
                return new SysUser("user not available");
            }

            @Override
            public SysUser query4Get(SysUser sysUser) {
                System.err.println("hystrix fallback method");
                return new SysUser("user not available");
            }

            @Override
            public Boolean save(SysUser sysUser) {
                System.err.println("hystrix fallback method");
                return false;
            }
        };
    }
}
