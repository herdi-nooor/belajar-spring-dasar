package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.daat.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void  setUp(){
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOptinal(){
        Foo foo = applicationContext.getBean(Foo.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }


}
