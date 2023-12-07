package com.devsuperior.Aula01.service;

import com.devsuperior.Aula01.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double calculateShipping(Double basic){

        Double shipping;

        if (basic < 100){
            shipping = 20.00;
        } else if (100 <= basic && basic < 200) {
            shipping = 12.00;
        }
        else {
            shipping = 0.0;
        }
        return shipping;
    }
}
