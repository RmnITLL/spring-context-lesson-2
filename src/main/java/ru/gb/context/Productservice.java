package ru.gb.context;

import org.springframework.stereotype.Component;

@Component
public class Productservice {

    public String getTitleById(Long id) {
        return "Продукт #" + id;
    }
}
