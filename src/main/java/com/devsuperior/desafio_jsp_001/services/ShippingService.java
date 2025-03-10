package com.devsuperior.desafio_jsp_001.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio_jsp_001.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double amount = 0.0;
		if (order.getBasic() < 100.0) {
			amount = 20.0;
		} else if (order.getBasic() < 200.0) {
			amount = 12.0;
		} else {
			amount = 0.0;
		}
		return amount;
	}
}
