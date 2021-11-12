package hnr.belajarSpring.core;

import hnr.belajarSpring.core.Configuration.BarConfig;
import hnr.belajarSpring.core.Configuration.FooConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfig.class,
        BarConfig.class
})
public class MainConfig {
}
