package com.practice.spring.basics.springbasics;

import com.practice.spring.basics.springbasics.properties.ExternalPropertyRead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("app.properties")
public class SpringBasicsPropertyFetchApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBasicsPropertyFetchApplication.class);

	
	public static void main(String[] args) {
		

		try(AnnotationConfigApplicationContext springApplicationContext
					= new AnnotationConfigApplicationContext(SpringBasicsPropertyFetchApplication.class);
		) {

			ExternalPropertyRead externalPropertyBean = springApplicationContext.getBean(ExternalPropertyRead.class);
			LOGGER.info("URL from property : {}",externalPropertyBean.returnURlReadFromProp());
		}

	}

}
