package com.fa.spring;

import com.fa.spring.bean.Spring;
import com.fa.spring.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        String path = "spring-context.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        User user = ac.getBean("user", User.class);
        System.out.println(user.getStudent().toString());
        /*User user1 = ac.getBean("user", User.class);
        System.out.println(user1);*/
        /*UserServiceImpl userServiceImpl = ac.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.show();*/
        /*ApplicationContext context = new AnnotationConfigApplicationContext(Spring.class);
        User user = (User)context.getBean("user");
        user.init();
        user.destroy();*/
    }
}