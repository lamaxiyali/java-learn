package com.example.demo.mapper;

import com.example.demo.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author 32933
 */

public class LamaxiyaBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        GenericBeanDefinition indexService = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition("indexService");
        indexService.setBeanClass(UserService.class);
        System.out.println(indexService.isLazyInit());
    }
}
