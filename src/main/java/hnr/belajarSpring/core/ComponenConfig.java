package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
    "hnr.belajarSpring.core.serivce",
    "hnr.belajarSpring.core.Repository",
    "hnr.belajarSpring.core.Configuration"
})
@Import(MultiFoo.class)
public class ComponenConfig {
}
