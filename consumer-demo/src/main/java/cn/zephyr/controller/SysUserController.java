package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: SysUserController
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/12 19:54
 */
@RestController
@RequestMapping("consumer/sysUser/")
public class SysUserController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("selectById")
    public SysUser selectById(Integer id) {
        String url = "http://user-service/sysUser/selectById?id=" + id;
        return restTemplate.getForObject(url, SysUser.class);
    }

}
