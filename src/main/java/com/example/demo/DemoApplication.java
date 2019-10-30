package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 项目启动类
 *
 * @author daniel
 * @version 2019-10-30
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(DemoApplication.class);
		try {
			SpringApplication.run(DemoApplication.class, args);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
