package com.hanbit.pahnki.kim.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.hanbit.pahnki.kim.core.service.SampleService;

public class SpringApplication {

	public static void main(String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);

		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"spring/applicationContext-core.xml",
					"spring/applicationContext-dao.xml");

			SampleService sampleService = context.getBean(SampleService.class);

			sampleService.daoTest();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
