package hnr.belajarSpring.core.Aplication;

import hnr.belajarSpring.core.daat.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = FooAplication.class)
class FooAplicationTest {
    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }

}