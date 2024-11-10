package com.gautam.springtest.services.impl;

import com.gautam.springtest.services.RedText;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedTextImpl implements RedText {
    @Override
    public String print() {
        return "red";
    }
}
