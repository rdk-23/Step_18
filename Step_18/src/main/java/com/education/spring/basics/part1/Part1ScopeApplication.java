package com.education.spring.basics.part1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.education.spring.basics.part1.basic.BinarySearchImpl;
import com.education.spring.basics.part1.scope.PersonDAO;
//@SpringBootApplication annotation automatically scans the package and sub packages of the package where this is in for the beans.
//So Part1Application which packages is it in? It is in the com.education.spring.basic.part1 specific package.

@SpringBootApplication
public class Part1ScopeApplication {
		
	//Logger is using in the static main so it should be static
	static Logger LOGGER = LoggerFactory.getLogger(Part1ScopeApplication.class);

	public static void main(String[] args) {
		
		// Spring application Context:
		ApplicationContext applicationContext = SpringApplication.run(Part1ScopeApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());

	}

}
