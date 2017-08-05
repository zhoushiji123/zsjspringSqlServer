package com.springSqlServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zsj on 2017/8/5.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Dao dao = (Dao)applicationContext.getBean("dao");
        dao.insert();
    }
}
