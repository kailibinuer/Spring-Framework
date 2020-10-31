package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.Extrasessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("JD1")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    private Extrasessions extrasessions;

    //or put qualifier in constructor

    public Java(@Qualifier("officeHours") Extrasessions extrasessions) {
        this.extrasessions = extrasessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extrasessions.getHours()));
    }

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +'}';
    }
}
