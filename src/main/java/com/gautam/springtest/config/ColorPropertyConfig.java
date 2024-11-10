package com.gautam.springtest.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix= "color")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ColorPropertyConfig {
    private String red;
    private String blue;
    private String green;
}
