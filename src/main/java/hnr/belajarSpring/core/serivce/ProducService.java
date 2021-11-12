package hnr.belajarSpring.core.serivce;

import hnr.belajarSpring.core.Repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// kita juga madih bisa menggunakan annotation spring seperti dibawah ini
//@Scope(value = "prototype")
//@Lazy
@Component
public class ProducService {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProducService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProducService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }

}
