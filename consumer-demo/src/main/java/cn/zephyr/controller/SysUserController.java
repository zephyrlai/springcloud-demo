package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("selectById")
    public SysUser selectById(Integer id) {
        ServiceInstance instance = discoveryClient.getInstances("user-service").get(0);
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/sysUser/selectById?id=" + id;
        return restTemplate.getForObject(url, SysUser.class);
    }

}
