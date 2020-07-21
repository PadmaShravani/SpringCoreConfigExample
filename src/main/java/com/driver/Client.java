package com.driver;

import com.bean.PojoClass;
import com.config.AppConfig;

import com.service.BusinessLogic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        PojoClass pojo=ac.getBean("pojoClass", PojoClass.class);
       BusinessLogic serv= ac.getBean("businessLogic", BusinessLogic.class);
        pojo.disp();
        System.out.println(pojo.toString());
        serv.ser();
        serv.sub();
        ac.stop();
    }
}
