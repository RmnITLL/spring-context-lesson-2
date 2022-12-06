package ru.gb.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private Productservice productservice;

    @Autowired
    public void setProductservice(Productservice productservice) {
        this.productservice = productservice;
    }

//    @Autowired
//    public OrderService(Productservice productservice) {
//        this.productservice = productservice;
//    }

    public void createOrderFromProduct(Long productId) {
        System.out.println("Заказ создан:");
        System.out.println(productservice.getTitleById(productId));
    }
}
