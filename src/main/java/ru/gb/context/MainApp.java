package ru.gb.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
//
//        Scanner sc = new Scanner(System.in);
//        Long id = sc.nextLong();
//        orderService.createOrderFromProduct(id);

        orderService.createOrderFromProduct(1L);
        orderService.createOrderFromProduct(1L);
        orderService.createOrderFromProduct(1L);
        orderService.createOrderFromProduct(1L);
        orderService.createOrderFromProduct(1L);
        context.close();
    }
}
