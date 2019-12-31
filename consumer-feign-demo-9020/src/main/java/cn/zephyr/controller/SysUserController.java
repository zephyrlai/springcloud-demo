package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.FeignSysUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: SysUserController
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/31 20:49
 */
@RestController
@RequestMapping("consumer/sysUser")
public class SysUserController {

    @Resource
    private FeignSysUserService feignSysUserService;

    @RequestMapping("selectById/{id}")
    public SysUser selectById(@PathVariable Integer id){
        return feignSysUserService.selectById(id);
    }
}
