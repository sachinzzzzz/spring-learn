package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {

    public static void main(String []args){

        //load configurations XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOCLooseCouplingExample.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());
    }
}
