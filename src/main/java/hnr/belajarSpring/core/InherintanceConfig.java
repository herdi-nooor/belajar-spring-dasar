package hnr.belajarSpring.core;

import hnr.belajarSpring.core.serivce.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InherintanceConfig {
}
