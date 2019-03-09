package kumar.durgesh.order.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kumar.durgesh.order.dto.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	@GetMapping("/")
	public String order() {
	return "index";
	}
	@GetMapping("/listorder/{id}")
	public List<Order> listOrder(@PathVariable("id") int id) {
		Map<Integer,List<Order>> orderMap = new HashMap<>();
		List<Order> orderList1 = new ArrayList<>();
		orderList1.add(new Order("Paneer Manchurian","Veg",2));
		orderList1.add(new Order("Gobi Manchurian","Veg",1));
		orderList1.add(new Order("Chicken Butter Masala","NonVeg",1));
		orderList1.add(new Order("Crust Pizza","Veg",5));
		
		List<Order> orderList2 = new ArrayList<>();
		orderList2.add(new Order("Paneer Manchurian2","Veg",2));
		orderList2.add(new Order("Gobi Manchurian2","Veg",1));
		orderList2.add(new Order("Chicken Butte2r Masala","NonVeg",1));
		orderList2.add(new Order("Crust Pizza2","Veg",5));
		orderMap.put(1, orderList1);
		orderMap.put(2, orderList2);

		return orderMap.get(id);

		
	}

}
