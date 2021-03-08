package per.itachi.java.test.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import per.itachi.java.test.spring.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void createOrder() {
	}

}
