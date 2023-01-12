package com.education.spring.basics.part1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;

import com.education.spring.basics.part1.basic.BinarySearchImpl;
//@SpringBootApplication annotation automatically scans the package and sub packages of the package where this is in for the beans.
//So Part1Application which packages is it in? It is in the com.education.spring.basic.part1 specific package.
@SpringBootApplication
public class Part1BasicApplication {
	// To best use of Spring we would need to tell it three different things:
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	// The dependency for BinarySearchImpl is a SortAlgorithm (becomes clear when
	// click on "new BinarySearchImpl" with pressed "Ctrl")

	public static void main(String[] args) {
		
		//SpringApplication.run(Part1BasicApplication.class, args);
		// We would want to create beans and we would want to wire in the dependencies.
		// Means, to create new QuickSortAlgorithm and wire it into the
		// binarySearchImpl.
		// That's called wiring.
		// new QuickSortAlgorithm is a bean:

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// QuickSortAlgorithm());

		// So instead of creation "BinarySearchImpl binarySearch = ...etc." Spring would
		// create it for us

		// Spring application Context:
		ApplicationContext applicationContext = SpringApplication.run(Part1BasicApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		//BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		//System.out.println(binarySearch2);

		int result = binarySearch.binarySearch(new int[] { 124, 4, 6 }, 3);

		System.out.println(result);

	}

}
