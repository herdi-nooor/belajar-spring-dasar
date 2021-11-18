package hnr.belajarSpring.core;

import hnr.belajarSpring.core.client.PaymentGtwayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory(){
        PaymentGtwayClient paymentGtwayClient = applicationContext.getBean(PaymentGtwayClient.class);

        Assertions.assertNotNull(paymentGtwayClient);
        Assertions.assertEquals("http://example", paymentGtwayClient.getEndPoint());
        Assertions.assertEquals("private", paymentGtwayClient.getPrivateKey());
        Assertions.assertEquals("public", paymentGtwayClient.getPublicKey());
    }

}
