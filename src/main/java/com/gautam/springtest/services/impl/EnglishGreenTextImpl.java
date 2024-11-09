package com.gautam.springtest.services.impl;

import com.gautam.springtest.services.GreenText;

public class EnglishGreenTextImpl implements GreenText {
    @Override
    public String print() {
        return "green";
    }
}
