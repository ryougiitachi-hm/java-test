package per.itachi.java.test.cucumber.step;

import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration
public class OrderServiceStep {
	
	@Given("a valid consumer")
	public void useConsumer() {
		System.out.println("a valid consumer");
	}
	
	@When("one place an order")
	public void placeOrder() {
		System.out.println("one place an order");
	}
	
	@Given("approved")
	public void theOrderShouldBeApproved() {
		System.out.println("approved");
	}
}
