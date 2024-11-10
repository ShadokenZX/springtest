package com.gautam.springtest;

import com.gautam.springtest.config.ColorPropertyConfig;
import com.gautam.springtest.services.ColorText;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class SpringtestApplication implements CommandLineRunner {

	@Autowired
	private ColorText colorText;

	@Autowired
	private ColorPropertyConfig colorConfig;


	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}


    @Override
	public void run(final String... args)
	{
		log.info(colorText.print());
		log.info(String.join(",",colorConfig.getRed(), colorConfig.getBlue(), colorConfig.getGreen()));
	}

}
