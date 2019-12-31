package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: SysUserController
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/11 18:51
 */
@RequestMapping("sysUser")
@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @Resource
    private HttpServletRequest request;

    @RequestMapping("selectById/{id}")
    public SysUser selectById(@PathVariable Integer id){
        System.err.println(request.getRequestURL());
        return sysUserService.selectById(id);
    }

    @RequestMapping("selectById4Get")
    public SysUser selectById4Get(@RequestParam("id") Integer id){
        System.err.println(request.getRequestURL());
        return sysUserService.selectById(id);
    }

    @RequestMapping("query4Get")
    public SysUser query4Get(@RequestBody SysUser sysUser){
        return sysUserService.query4Get(sysUser);
    }

    @PostMapping("save")
    public Integer save(@RequestBody SysUser sysUser){
        return sysUserService.save(sysUser);
    }
}
