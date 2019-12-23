package cn.zephyr;

import cn.zephyr.autowire.anno.Anno1;
import cn.zephyr.autowire.anno.Anno2;
import cn.zephyr.autowire.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
class ConsumerDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private List<MyService> msList00;

	@Anno1
	@Autowired
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
