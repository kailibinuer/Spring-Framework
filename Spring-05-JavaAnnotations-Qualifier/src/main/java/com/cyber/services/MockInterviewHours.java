package com.cyber.services;

import com.cyber.interfaces.Extrasessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements Extrasessions {

    @Override
    public int getHours() {
        return 9;
    }
}
