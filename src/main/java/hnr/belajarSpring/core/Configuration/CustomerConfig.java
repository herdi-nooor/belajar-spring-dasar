package hnr.belajarSpring.core.Configuration;

import hnr.belajarSpring.core.Repository.CustumerRepository;
import org.springframework.cglib.core.internal.CustomizerRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfig {

    @Primary
    @Bean
    public CustumerRepository normalCustumerRepository(){
        return new CustumerRepository();
    }

    @Bean
    public CustumerRepository premiumCustumerRepository(){
        return new CustumerRepository();
    }
}
