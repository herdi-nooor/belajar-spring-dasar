package hnr.belajarSpring.core.Aplication;

import hnr.belajarSpring.core.daat.Foo;
import hnr.belajarSpring.core.listener.AppStartingLIstenner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooAplication {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooAplication.class, args);
//
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);


        SpringApplication application = new SpringApplication(FooAplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingLIstenner()));

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
