package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBaenTest {

    private  ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(PrinaryBean.class);
    }

    @Test
    void PrimaryTest(){

        Foo fooo = context.getBean(Foo.class);
        Foo fooo1 = context.getBean("foo1", Foo.class);
        Foo fooo2 = context.getBean("foo2", Foo.class);
    }
}
