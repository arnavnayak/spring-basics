package com.practice.spring.basics.springbasics;

<<<<<<< HEAD
import com.practice.spring.basics.springbasics.basic.BinarySearchImprovedAgain;
import com.practice.spring.basics.springbasics.basic.BinarySearchImprovedAgainSetterInjection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.spring.basics.springbasics.basic.BinarySearchImprovedAgain;
import com.practice.spring.basics.springbasics.basic.BinarySearchImprovedAgainSetterInjection;

@SpringBootApplication
>>>>>>> 2b69b1d01ac85f3ee2d503cb39b726ef5b3fe070
public class SpringBasicsApplication {

	//What are the beans ?
	//What are the dependencies of the beans?
	//Where to search for the bean?
	//we need to answer these for the spring.
	
	public static void main(String[] args) {
		
//		BinarySearchImpl bSearch =  new BinarySearchImpl(); //old way
//		int result = bSearch.binarySearch(new int[] {1,2,3},2);
		
//		BinarySearchImproved bSearch =new BinarySearchImproved(new QuickSortAlgo());// new way with loosely coupled improved way
		// still the above can be made to instantiate bean wihtout even doing it as above so as to make it more loosely copupled
		
<<<<<<< HEAD
		ConfigurableApplicationContext springApplicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
=======
		ConfigurableApplicationContext springApplicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
>>>>>>> 2b69b1d01ac85f3ee2d503cb39b726ef5b3fe070
		
		BinarySearchImprovedAgain bSearch =  springApplicationContext.getBean(BinarySearchImprovedAgain.class);
		
		BinarySearchImprovedAgainSetterInjection bSearchSettInjected = springApplicationContext.getBean(BinarySearchImprovedAgainSetterInjection.class);
		
		int result = bSearch.binarySearch(new int[] {2,1,4},2);
		
		System.out.println("result with constructor Injection : "+result);
		 
		 result = bSearchSettInjected.binarySearch(new int[] {2,1,4},2);
		 
		System.out.println("result with setter Injection : "+result);
		
	}

}
