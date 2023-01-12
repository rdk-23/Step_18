package com.education.spring.basics.part1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.education.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
//this is a default setting of the ComponentScan:
@ComponentScan("com.education.spring.basics.componentscan")
public class Part1ComponentScanApplication {
		
	//Logger is using in the static main so it should be static
	static Logger LOGGER = LoggerFactory.getLogger(Part1ComponentScanApplication.class);

	public static void main(String[] args) {
		
		// Spring application Context:
		ApplicationContext applicationContext = SpringApplication.run(Part1ComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}",componentDAO);
		

	}

}
