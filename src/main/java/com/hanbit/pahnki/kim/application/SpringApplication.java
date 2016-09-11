package com.hanbit.pahnki.kim.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

public class SpringApplication {

	public static void main(String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");

			ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-core.xml");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
