package hnr.belajarSpring.core;

import hnr.belajarSpring.core.serivce.MerchantServiceImpl;
import hnr.belajarSpring.core.serivce.MerhantService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InnertanceTst {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(InherintanceConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void tesxt(){
        MerhantService merhantService = applicationContext.getBean(MerhantService.class);
        MerhantService merhantServiceimpl= applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merhantService, merhantServiceimpl);
    }
}
