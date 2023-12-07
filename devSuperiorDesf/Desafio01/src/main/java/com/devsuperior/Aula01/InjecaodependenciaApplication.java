package com.devsuperior.Aula01;

import com.devsuperior.Aula01.entity.Order;
import com.devsuperior.Aula01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaodependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	Order order = new Order(2564,150.00,20.00);

	public static void main(String[] args) {
		SpringApplication.run(InjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(orderService.totalValue(order));
	}
}
