package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.Extrasessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //or put qualifier in field
  //  @Autowired
  //  @Qualifier("officeHours")
    private Extrasessions extrasessions;

    //or put qualifier in constructor

    public Java(@Qualifier("officeHours") Extrasessions extrasessions) {
        this.extrasessions = extrasessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extrasessions.getHours()));
    }


}
