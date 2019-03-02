package kumar.durgesh.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kumar.durgesh.order.dto.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping("/listorder")
	public List<Order> listOrder() {
		List<Order> orderList = new ArrayList<>();
		orderList.add(new Order("Paneer Manchurian","Veg",2));
		orderList.add(new Order("Gobi Manchurian","Veg",1));
		orderList.add(new Order("Chicken Butter Masala","NonVeg",1));
		orderList.add(new Order("Crust Pizza","Veg",5));
		return orderList;

		
	}

}
