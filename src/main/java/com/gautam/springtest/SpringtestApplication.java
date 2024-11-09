package com.gautam.springtest;

import com.gautam.springtest.services.ColorText;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class SpringtestApplication implements CommandLineRunner {

	private ColorText colorText;


	public SpringtestApplication(ColorText colorText)
	{
		this.colorText = colorText;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}


    @Override
	public void run(final String... args)
	{
		log.info(colorText.print());
	}

}
