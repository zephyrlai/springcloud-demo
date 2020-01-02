package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.SysUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        SysUser sysUser = sysUserService.selectById(id);
        return sysUser;
    }
}
