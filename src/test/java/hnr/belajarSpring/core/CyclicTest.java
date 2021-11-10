package hnr.belajarSpring.core;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void  testCyclic(){
        ApplicationContext context = new AnnotationConfigApplicationContext(CyclicCofig.class);
    }
}
