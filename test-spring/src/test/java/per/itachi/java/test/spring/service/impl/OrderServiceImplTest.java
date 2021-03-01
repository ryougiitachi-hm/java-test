package per.itachi.java.test.spring.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import per.itachi.java.test.spring.TestCaseConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestCaseConfiguration.class)
public class OrderServiceImplTest {
	
	private final Logger logger = LoggerFactory.getLogger(OrderServiceImplTest.class);
	
	@Test
	public void test() {
		logger.info("This is a test method. ");
	}
}
