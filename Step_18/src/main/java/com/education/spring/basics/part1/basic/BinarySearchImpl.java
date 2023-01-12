package com.education.spring.basics.part1.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;


//This @Component construction helps to tell Spring where is a bean:
@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	//Logger creation:
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	// Now we need explain Spring that the BinarySearchImpl DEPENDS on
	// sortAlgorithnm or in another words
	// In order to tell Spring that from two @Components the sortAlgorithm is a
	// DEPENDENCY of BinarySearchImpl
	// it is necessary to write:
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	// public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	// super();
	// this.bubbleSortAlgorithm = sortAlgorithm;
	// }

	public int binarySearch(int[] numbers, int numbersToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		// Search the array

		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}
	

}
