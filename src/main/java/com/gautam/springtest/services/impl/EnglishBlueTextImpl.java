package com.gautam.springtest.services.impl;

import com.gautam.springtest.services.BlueText;
import org.springframework.stereotype.Service;


@Service
public class EnglishBlueTextImpl implements BlueText {
    @Override
    public String print() {
        return "blue";
    }
}
