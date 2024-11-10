package com.gautam.springtest.services.impl;

import com.gautam.springtest.services.BlueText;
import com.gautam.springtest.services.ColorText;
import com.gautam.springtest.services.GreenText;
import com.gautam.springtest.services.RedText;
import org.springframework.stereotype.Component;

@Component
public class ColorTextImpl implements ColorText {

    private RedText redText;
    private BlueText blueText;
    private GreenText greenText;

    public ColorTextImpl(RedText red,BlueText blue,GreenText green)
    {
        redText = red;
        blueText = blue;
        greenText = green;
    }


    @Override
    public String print() {
        return String.join(" ",redText.print(),blueText.print(), greenText.print());
    }

    @Override
    public String printfromproperties() {
        return String.join(" ",redText.print(),blueText.print(), greenText.print());
    }
}
