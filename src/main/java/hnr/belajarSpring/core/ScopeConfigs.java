package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Bar;
import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.prefs.BackingStoreException;

@Slf4j
@Configuration
public class ScopeConfigs {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("ini foo");
        return new Foo();
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("ini bar");
        return new Bar();
    }
}
