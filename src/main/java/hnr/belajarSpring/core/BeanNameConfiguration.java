package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(name = "foofirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(name = "foosecond")
    public Foo foo2(){
        return new Foo();
    }
}
