package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import cn.zephyr.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @RequestMapping("selectById")
    public SysUser selectById(Integer id ){
        return sysUserService.selectById(id);
    }
}
