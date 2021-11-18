package hnr.belajarSpring.core;

import hnr.belajarSpring.core.factory.PaymentGetwayClientFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGetwayClientFactory.class
})
public class FactoryConfig {
}
