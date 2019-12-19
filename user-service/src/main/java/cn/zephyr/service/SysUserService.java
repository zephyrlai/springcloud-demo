package cn.zephyr.service;

import cn.zephyr.entity.SysUser;
import cn.zephyr.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserService
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/11 18:46
 */
@Service
public class SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public SysUser selectById(Integer id){
        if(id==2){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.sysUserMapper.selectByPrimaryKey(id);
    }
}
