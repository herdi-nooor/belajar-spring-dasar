package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaenNameConfigTest {

    private  ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void PrimaryTest(){

        Foo fooo = context.getBean(Foo.class);
        Foo fooo1 = context.getBean("foofirst", Foo.class);
        Foo fooo2 = context.getBean("foosecond", Foo.class);

        Assertions.assertSame(fooo, fooo1);
        Assertions.assertNotSame(fooo, fooo2);
    }
}
