package hnr.belajarSpring.core.processor;

import hnr.belajarSpring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix generator processor {}", beanName);

        if (bean instanceof IdAware){
            IdAware idAware = (IdAware) bean;
            log.info("Prefix generator processor {}", beanName);
            idAware.setId("HNSS-" + idAware.getId());
        }

        return bean;
    }
}
