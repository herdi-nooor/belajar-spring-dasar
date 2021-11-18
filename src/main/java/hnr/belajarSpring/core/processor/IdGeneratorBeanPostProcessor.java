package hnr.belajarSpring.core.processor;

import hnr.belajarSpring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("id generator processor {}", beanName);
        if (bean instanceof IdAware){
            IdAware idAware = (IdAware) bean;
            log.info("id generator processor {}", beanName);
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }
}
