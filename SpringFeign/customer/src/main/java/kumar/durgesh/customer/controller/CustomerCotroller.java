package kumar.durgesh.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kumar.durgesh.customer.dto.Customer;
import kumar.durgesh.customer.dto.Order;
import kumar.durgesh.customer.feignclients.OrderFeignClients;

@RestController
@RequestMapping("/customer")

public class CustomerCotroller {
	@Autowired(required=true)
	OrderFeignClients orderFeignClients;
	@RequestMapping("/getcustomer")
	public Customer getCustomer() {
		return new Customer("Durgesh Kumar",1234554);
	}
	
	@RequestMapping("/order/{id}")
	public List<Order> getCustomerOrder(@PathVariable("id") int id) {
		return orderFeignClients.getOrders(id);
	}
}
