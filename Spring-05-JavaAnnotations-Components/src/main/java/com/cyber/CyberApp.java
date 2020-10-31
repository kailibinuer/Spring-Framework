package com.cyber;

import com.cyber.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course= container.getBean("java", Course.class); //container create java object then give it to me

        course.getTeachingHours();

        Course course2 = container.getBean("selenium",Course.class);
        course2.getTeachingHours();

        Course course3 = container.getBean("api",Course.class);
        course3.getTeachingHours();

    }
}
