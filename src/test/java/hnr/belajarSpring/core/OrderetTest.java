package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Car;
import hnr.belajarSpring.core.processor.IdGeneratorBeanPostProcessor;
import hnr.belajarSpring.core.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderetTest {

    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanPostProcessor.class,
            PrefixIdGeneratorBeanPostProcessor.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testCar(){
        Car car = applicationContext.getBean(Car.class);

        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("HNSS-"));
    }
}
