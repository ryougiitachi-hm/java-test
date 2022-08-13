package per.itachi.java.test.spring.service.impl;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import per.itachi.java.test.spring.configuration.MvcConfiguration;
import per.itachi.java.test.spring.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderServiceImplTest.TestConfiguration.class)
public class OrderServiceImplTest {
	
	private final Logger logger = LoggerFactory.getLogger(OrderServiceImplTest.class);

	@Autowired
	private TestRestTemplate testRestTemplate;

//	@Autowired
//	private ObjectMapper objectMapper;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private OrderService orderServiceImpl;

	@Test
	public void test() throws JsonProcessingException {
		logger.info("This is a test method. ");
//		logger.info("json is {}. ", objectMapper.writeValueAsString(Collections.singletonMap("key", "value")));
		ResponseEntity<Object> responseEntity = restTemplate.getForEntity("https://www.baidu.com", Object.class);
	}

	@Configuration
	@Import(OrderServiceImpl.class)
	static class TestConfiguration {

		@Bean
		public RestTemplate restTemplate() {
			return Mockito.mock(RestTemplate.class);
		}
	}

}
