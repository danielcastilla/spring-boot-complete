package dancas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dancas.payload.Customer;

@RestController
public class CustomerController {

	@RequestMapping("/customer")
	public Customer getCustomer(){
		return new Customer(1,"Daniel","Castilla","678990077");
	}
}
