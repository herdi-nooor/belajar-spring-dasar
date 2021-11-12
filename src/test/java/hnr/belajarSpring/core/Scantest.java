package hnr.belajarSpring.core;

import hnr.belajarSpring.core.Configuration.FooConfig;
import hnr.belajarSpring.core.daat.Bar;
import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scantest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void test(){
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bean = applicationContext.getBean(Bar.class);
    }
}
