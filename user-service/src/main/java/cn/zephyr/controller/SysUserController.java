package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("selectById")
    public SysUser selectById(Integer id ){
        System.err.println(request.getRequestURL());
        return sysUserService.selectById(id);
    }
}
