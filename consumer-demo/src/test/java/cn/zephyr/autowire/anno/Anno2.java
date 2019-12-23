package cn.zephyr.autowire.anno;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * @ClassName: Anno2
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/23 17:21
 */
@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface Anno2 {
}
