package com.example.demo;


import com.example.demo.service.MyTestBean;
import com.example.demo.test.Test11;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SpringBootTest(classes = Test11.class)
public class MyBeanTest {
    @Test
    public void testMyBean(){
        Resource resource;
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println(myTestBean.getTestStr());

    }
}
