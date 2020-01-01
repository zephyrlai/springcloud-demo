package cn.zephyr.controller;

import cn.zephyr.entity.SysUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTemplateSysUserController
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/1/1 18:02
 */
@RestController
@RequestMapping("rest/sysUser")
public class RestTemplateSysUserController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("selectById/{id}")
    @HystrixCommand(fallbackMethod = "myFallback")
    public SysUser selectById(@PathVariable("id") Integer id){
        String url = "http://user-service/sysUser/selectById?id=" + id;
        return restTemplate.getForObject(url, SysUser.class);
    }

    public SysUser myFallback(Integer id){
        return new SysUser("user not available");
    }
}
