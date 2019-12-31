package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.FeignSysUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("selectById4Get")
    public SysUser selectById4Get(Integer id){
        return feignSysUserService.selectById4Get(id);
    }

    @RequestMapping("query4Get")
    public SysUser query4Get(SysUser sysUser){
        return feignSysUserService.query4Get(sysUser);
    }

    @PostMapping("save")
    public Boolean save(SysUser sysUser){
        return feignSysUserService.save(sysUser);
    }
}
