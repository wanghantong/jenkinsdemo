package com.dragon.jenkinsdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsdemoApplicationTests {

	@Autowired
	HelloJenkins helloJenkins;

	@Autowired
	HelloDI helloDI;

	@Test
	public void contextLoads() {
	}

	@Test
	public void demoTest() {
		helloJenkins.demo("I am first test demo!");
	}

	@Test
	public void diDemoTest() {
		helloDI.diDemo("di test !");
	}

}
