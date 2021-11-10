package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Bar;
import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.daat.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepedensiInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependensiInjectionConfig.class);
    }
    @Test
    void testDI(){
        Foo fooo = applicationContext.getBean(Foo.class);
        Bar baar = applicationContext.getBean(Bar.class);
        FooBar foooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNotSame(fooo, foooBar.getFoo());
        Assertions.assertSame(baar, foooBar.getBar());
    }
    @Test
    void testNoDI() {
        var foo  = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
