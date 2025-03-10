package com.devsuperior.desafio_jsp_001.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio_jsp_001.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100.0)) + shippingService.shipment(order); 
		//return (order.getBasic() * (order.getDiscount() / 100.0) + shippingService.shipment(order)); 
		}
}
