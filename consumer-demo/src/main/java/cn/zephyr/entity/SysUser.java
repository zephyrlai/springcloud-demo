package cn.zephyr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: SysUser
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/12 19:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {
    private Integer id;
    // 用户名
    private String username;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer gender;

    // 备注
    private String remarks;

    public SysUser(String username) {
        this.username = username;
    }
}
