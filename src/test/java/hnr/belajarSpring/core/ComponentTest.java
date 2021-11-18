package hnr.belajarSpring.core;

import hnr.belajarSpring.core.Repository.CategoryRepository;
import hnr.belajarSpring.core.Repository.CustumerRepository;
import hnr.belajarSpring.core.Repository.ProductRepository;
import hnr.belajarSpring.core.daat.MultiFoo;
import hnr.belajarSpring.core.serivce.CategoryService;
import hnr.belajarSpring.core.serivce.CustumerService;
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

    @Test
    void testSetterDepedenciInjection(){

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());

    }

    @Test
    void testQualifierDI(){

        CustumerService custumerService = applicationContext.getBean(CustumerService.class);

        CustumerRepository normalcustumerRepository = applicationContext.getBean("normalCustumerRepository", CustumerRepository.class);
        CustumerRepository premiumcustumerRepository = applicationContext.getBean("premiumCustumerRepository", CustumerRepository.class);
    }

    @Test
    void testObjectProvider(){
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(3,  multiFoo.getFoos().size());
    }
}
