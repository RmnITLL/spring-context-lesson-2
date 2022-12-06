package ru.gb.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "ps")
public class Productservice {

    private ProductRepository ProductRepository;

    @Autowired
    public void setProductRepository(@Qualifier("inMemProductRepository") ru.gb.context.ProductRepository productRepository) {
        ProductRepository = productRepository;
    }

    public String getTitleById(Long id) {
        return ProductRepository.findById(id).getTitle();
    }
}
