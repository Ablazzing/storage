package org.javaacademy.storage;

import org.javaacademy.storage.consumer.Petrovich;
import org.javaacademy.storage.producer.AbsolutProducer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.javaacademy.storage");
        AbsolutProducer absolutProducer = context.getBean(AbsolutProducer.class);
        absolutProducer.supply();
        absolutProducer.supply();

        Petrovich petrovich = context.getBean(Petrovich.class);
        petrovich.accept();
    }
}
