package com.gautam.springtest.services.impl;

import com.gautam.springtest.services.GreenText;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenTextImpl implements GreenText {
    @Override
    public String print() {
        return "green";
    }
}
