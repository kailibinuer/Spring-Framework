package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    public void getTeachingHours() {
        System.out.println("Teaching hours : 20");
    }
}