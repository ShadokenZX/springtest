/*package com.gautam.springtest.config;

import com.gautam.springtest.services.BlueText;
import com.gautam.springtest.services.ColorText;
import com.gautam.springtest.services.GreenText;
import com.gautam.springtest.services.RedText;
import com.gautam.springtest.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public BlueText blueText()
    {
        return new AltEnglishBlueTextImpl();
    }

    @Bean
    public RedText redText()
    {
        return new EnglishRedTextImpl();
    }

    @Bean
    public GreenText greenText()
    {
        return new EnglishGreenTextImpl();
    }

    @Bean
    public ColorText colorText(RedText red,BlueText blue,GreenText green)
    {
        return new ColorTextImpl(red, blue, green);
    }


}
*/

//One way of doing it , can also do it using components