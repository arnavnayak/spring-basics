package com.practice.spring.basics.springbasics;

<<<<<<< HEAD
import com.practice.spring.basics.springbasics.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
=======
import com.practice.spring.basics.springbasics.basic.BinarySearchImprovedAgainSetterInjection;
import com.practice.spring.basics.springbasics.cdi.SomeCdiBusiness;
import com.practice.spring.basics.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
>>>>>>> 2b69b1d01ac85f3ee2d503cb39b726ef5b3fe070
public class SpringBasicsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsCdiApplication.class);
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		ConfigurableApplicationContext springApplicationContext = new AnnotationConfigApplicationContext(SpringBasicsCdiApplication.class);
=======
		ConfigurableApplicationContext springApplicationContext = SpringApplication.run(SpringBasicsCdiApplication.class, args);
>>>>>>> 2b69b1d01ac85f3ee2d503cb39b726ef5b3fe070

		SomeCdiBusiness someCdiBusiness = springApplicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} -DAO {}",someCdiBusiness,someCdiBusiness.getSomeCdiDao());
	}

}
