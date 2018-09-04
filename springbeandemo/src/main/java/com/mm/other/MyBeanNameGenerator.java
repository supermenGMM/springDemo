package com.mm.other;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

import javax.sound.midi.Soundbank;

/**
 * 自定义名字策略
 */
public class MyBeanNameGenerator implements BeanNameGenerator {
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanClassName = definition.getBeanClassName();
        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println(beanClassName+"------0");
        return beanClassName;
    }

}
