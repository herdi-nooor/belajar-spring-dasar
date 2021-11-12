package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependOntest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void  setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DipendOnConfig.class);
    }

    @Test
    void tetDependensi(){
        Foo foo = applicationContext.getBean(Foo.class);
    }

}
