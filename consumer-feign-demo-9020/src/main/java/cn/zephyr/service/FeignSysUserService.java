package cn.zephyr.service;

import cn.zephyr.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/selectById4Get")
    SysUser selectById4Get(@RequestParam("id") Integer id);

    @RequestMapping("/query4Get")
    SysUser query4Get(@RequestBody SysUser sysUser);

    @PostMapping("/save")
    Boolean save(SysUser sysUser);
}
