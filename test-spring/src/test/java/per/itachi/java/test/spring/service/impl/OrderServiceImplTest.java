package per.itachi.java.test.spring.service.impl;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import per.itachi.java.test.spring.TestCaseConfiguration;
import per.itachi.java.test.spring.configuration.MvcConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MvcConfiguration.class)
public class OrderServiceImplTest {
	
	private final Logger logger = LoggerFactory.getLogger(OrderServiceImplTest.class);
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Test
	public void test() throws JsonProcessingException {
		logger.info("This is a test method. ");
		logger.info("json is {}. ", objectMapper.writeValueAsString(Collections.singletonMap("key", "value")));
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("https://www.baidu.com", Object.class);
	}
	
}
