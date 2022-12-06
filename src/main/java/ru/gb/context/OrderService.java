package ru.gb.context;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public void createOrderFromProduct(Long productId) {
        System.out.println("Заказ создан:");
        System.out.println("Продукт №" + productId);
    }
}
