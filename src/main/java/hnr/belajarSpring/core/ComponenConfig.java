package hnr.belajarSpring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "hnr.belajarSpring.core.serivce",
    "hnr.belajarSpring.core.Repository",
    "hnr.belajarSpring.core.Configuration"
})
public class ComponenConfig {
}
