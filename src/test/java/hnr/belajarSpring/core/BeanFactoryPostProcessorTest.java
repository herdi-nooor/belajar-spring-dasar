package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.processor.FooBeanFactoryProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Inherited;

public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import({
            FooBeanFactoryProcessor.class
    })
    public static class TestConfigutration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfigutration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void tets() {
        Foo foo = applicationContext.getBean(Foo.class);
        Assertions.assertNotNull(foo);
    }
}
