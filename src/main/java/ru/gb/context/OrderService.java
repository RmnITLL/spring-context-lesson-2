package ru.gb.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class OrderService {

    private Productservice productservice;
    private FileOutputStream fileOut;

    public OrderService(Productservice productservice, FileOutputStream fileOut) {
        this.productservice = productservice;
        this.fileOut = fileOut;
    }

//    @Autowired
//    public void setProductservice(Productservice productservice) {
//        this.productservice = productservice;
//    }

//    @Autowired
//    public OrderService(Productservice productservice) {
//        this.productservice = productservice;
//    }

    public void createOrderFromProduct(Long productId) {
        System.out.println("Заказ создан:");
        System.out.println(productservice.getTitleById(productId));
        try {
            fileOut.write("READY".getBytes());
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
