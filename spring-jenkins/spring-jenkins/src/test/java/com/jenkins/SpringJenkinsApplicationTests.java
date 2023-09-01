package com.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j

@SpringBootTest
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("test case executed");
		log.info("second test case executed");
		assertEquals(true,true);
	}

}
