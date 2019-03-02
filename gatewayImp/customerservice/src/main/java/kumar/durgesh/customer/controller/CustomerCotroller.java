package kumar.durgesh.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kumar.durgesh.customer.dto.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerCotroller {
	@RequestMapping("/getcustomer")
	public Customer getCustomer() {
		return new Customer("Durgesh Kumar",1234554);
	}
}
