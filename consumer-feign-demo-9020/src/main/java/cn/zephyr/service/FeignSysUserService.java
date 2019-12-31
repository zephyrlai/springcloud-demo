package cn.zephyr.service;

import cn.zephyr.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: FeignSysUserService
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/31 21:07
 */
@FeignClient("user-service")
@RequestMapping("/sysUser")
public interface FeignSysUserService {
    @RequestMapping("/selectById/{id}")
    SysUser selectById(@PathVariable Integer id);
}
