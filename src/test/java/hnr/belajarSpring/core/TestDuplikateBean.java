package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDuplikateBean {

    @Test
    void testDuplikate(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfigurationBean.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
            System.out.println("nih");
        });
        System.out.println("nah");
    }

    @Test
    void testDuplikat2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfigurationBean.class);

        Foo fooo1 = context.getBean("foo1", Foo.class);
        Foo fooo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(fooo1, fooo2);
    }

}
