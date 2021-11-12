package hnr.belajarSpring.core;

import hnr.belajarSpring.core.daat.cyclic.CyclicA;
import hnr.belajarSpring.core.daat.cyclic.CyclicB;
import hnr.belajarSpring.core.daat.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicCofig {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }

}
