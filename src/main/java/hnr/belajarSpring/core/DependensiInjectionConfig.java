package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Bar;
import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.daat.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependensiInjectionConfig {

    @Primary
    @Bean
    public Foo fooFirts(){
        return new Foo();
    }
    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
