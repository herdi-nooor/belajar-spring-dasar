package hnr.belajarSpring.core.Configuration;

import hnr.belajarSpring.core.daat.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfig {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}
