package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.Connection;
import hnr.belajarSpring.core.daat.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
//        applicationContext.registerShutdownHook(); // bisa jugamenggunakan ini untuk close.
    }

    @AfterEach
    void tearDown(){
        applicationContext.close();
    }

    @Test
    void  testConnection(){

        Connection connection = applicationContext.getBean(Connection.class);

    }

    @Test
    void testserver(){
        Server server = applicationContext.getBean(Server.class);
    }

}
