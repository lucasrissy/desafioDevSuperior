package com.devsuperior.Aula01.service;

import com.devsuperior.Aula01.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double totalValue(Order order){
        return order.getBasic() -
                (order.getBasic()*(order.getDiscount()/100)) +
                shippingService.calculateShipping(order.getBasic());
    }
}
