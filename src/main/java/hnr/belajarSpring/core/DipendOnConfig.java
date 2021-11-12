package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Bar;
import hnr.belajarSpring.core.daat.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DipendOnConfig {


    @Lazy
    @Bean
    @DependsOn("baro")
    public Foo foo(){
        log.info("ini foo");
        return new Foo();
    }

    @Bean
    public Bar baro(){
        log.info("ini bar");
        return new Bar();
    }

}
