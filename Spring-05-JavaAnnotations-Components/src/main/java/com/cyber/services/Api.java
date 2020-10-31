package com.cyber.services;

import com.cyber.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 7");
    }
}
