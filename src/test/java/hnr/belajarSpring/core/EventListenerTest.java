package hnr.belajarSpring.core;

import hnr.belajarSpring.core.listener.LoginSecondSuccessListener;
import hnr.belajarSpring.core.listener.LoginSuccessListener;
import hnr.belajarSpring.core.listener.UserListener;
import hnr.belajarSpring.core.serivce.UserServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
    @Configuration
    @Import({
            UserServices.class,
            LoginSuccessListener.class,
            LoginSecondSuccessListener.class,
            UserListener.class
    })
    public static  class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserServices userServices = applicationContext.getBean(UserServices.class);
        userServices.login("hn", "hhnn");
        userServices.login("hn", "hhhn");
        userServices.login("ngg", "hhnn");
    }
}
