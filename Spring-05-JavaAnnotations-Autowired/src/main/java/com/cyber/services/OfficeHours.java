package com.cyber.services;

import com.cyber.interfaces.Extrasessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements Extrasessions {
    public int getHours() {
        return 4;
    }
}
