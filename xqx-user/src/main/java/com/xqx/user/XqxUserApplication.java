package com.xqx.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class XqxUserApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// tomcat启动时 Class为标注有@SpringBootApplication的主启动类
		return application.sources(XqxUserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(XqxUserApplication.class, args);
	}
}
