package com.devsuperior.desafio_jsp_001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio_jsp_001.entities.Order;
import com.devsuperior.desafio_jsp_001.services.OrderService;

@SpringBootApplication
public class DesafioJsp001Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioJsp001Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------");
		Order order = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
		System.out.println("----------------------");
		order = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
		System.out.println("----------------------");
		order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
	}
}
