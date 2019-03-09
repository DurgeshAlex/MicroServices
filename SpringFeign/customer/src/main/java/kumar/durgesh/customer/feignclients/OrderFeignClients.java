package kumar.durgesh.customer.feignclients;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kumar.durgesh.customer.dto.Order;

@Configuration
@FeignClient(name="order", url="http://localhost:8002/")
public interface OrderFeignClients {
	
	@RequestMapping(method=RequestMethod.GET, value="/order/listorder/{id}")
	public List<Order> getOrders(@PathVariable("id") int custId);

}
