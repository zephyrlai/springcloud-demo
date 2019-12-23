package cn.zephyr.autowire;

import cn.zephyr.ConsumerDemoApplication;
import cn.zephyr.autowire.anno.Anno1;
import cn.zephyr.autowire.anno.Anno2;
import cn.zephyr.autowire.service.MyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName: AutowireTest
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/12/23 17:25
 */
@SpringBootTest(classes = ConsumerDemoApplication.class)
public class AutowireTest {
    @Autowired
    private List<MyService> msList00;

    @Autowired
    @Anno1
    private List<MyService> msList01;

    @Autowired
    @Anno2
    private List<MyService> msList02;

    @Test
    public void AutowireTest(){
        System.err.println(msList00.size());
        System.err.println(msList01.size());
        System.err.println(msList02.size());
    }
}
