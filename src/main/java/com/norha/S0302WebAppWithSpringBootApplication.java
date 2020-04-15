package com.norha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S0302WebAppWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(S0302WebAppWithSpringBootApplication.class, args);
		//1 Loads the defaults
		//2 Starts the boot application
		//3 Performs class path scan
		//4 Starts Local Tomcat 
		
		/*
		 * https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-
		 * application-properties.html#web-properties common application properties
		 * spring boot
		 */
		 	
		
		/*
		 * 2. SpringBootServletInitializer Extending the SpringBootServletInitializer
		 * class also allows us to configure our application when it's run by the
		 * servlet container, by overriding the configure() method.
		 * this is need for the thrid party server deployment of the spring boot application
		 */
		
		/*
		 * 6. Create war file from maven project in the pom.xml -- overview pakaging is
		 * war check that we need jdk insted of jre
		 */
		
		
	}

}
