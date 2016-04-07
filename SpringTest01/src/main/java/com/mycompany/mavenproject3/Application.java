/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericXmlApplicationContext;

import org.springframework.core.io.ClassPathResource;

public class Application {

//    @Bean
//    MessageProvider mockMessageService() {
//        return new MessageProvider() {
//            public String getMessage() {
//              return "Hello World!";
//            }
//        };
//    }
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
//        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
//        mr.render();
//
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
//        rdr.loadBeanDefinitions(new ClassPathResource("META-INF/spring/xml-bean-factory-config.xml"));
//        Oracle oracle = (Oracle) factory.getBean("oracle");
//        System.out.println(oracle.defineMeaningOfLife());
        
        GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext();
        ctx2.load("classpath:app-context-xml.xml");
//        ctx2.load("classpath:app-context-annotation.xml");
        ctx2.refresh();
//        MessageProvider messageProvider = ctx2.getBean("messageProvider", MessageProvider.class);
//        System.out.println(messageProvider.getMessage());
        
        MessageRenderer messageRenderer = ctx2.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
        
        IfInjectSimple simple = (IfInjectSimple)ctx2.getBean("injectSimple");
        System.out.println(simple);
        
        IfInjectSimpleSpel simple2 = (IfInjectSimpleSpel)ctx2.getBean("injectSimpleSpel");
        System.out.println(simple2);
        
        IfInjectRef injectRef = (IfInjectRef) ctx2.getBean("injectRef");
        System.out.println(injectRef);
    }
}
