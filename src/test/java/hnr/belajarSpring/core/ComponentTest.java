package hnr.belajarSpring.core;

import hnr.belajarSpring.core.Repository.ProductRepository;
import hnr.belajarSpring.core.serivce.ProducService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponenConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void test(){

        ProducService producService1 = applicationContext.getBean(ProducService.class);
        ProducService productService2 = applicationContext.getBean("producService", ProducService.class);

        Assertions.assertSame(producService1, productService2);

    }

    @Test
    void testConstructorDepedenciInjection(){
        ProducService producService = applicationContext.getBean(ProducService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, producService.getProductRepository());
    }
}
