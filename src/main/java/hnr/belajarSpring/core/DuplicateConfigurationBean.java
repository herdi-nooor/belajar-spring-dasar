package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateConfigurationBean {

    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
