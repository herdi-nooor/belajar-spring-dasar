package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrinaryBean {

    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
