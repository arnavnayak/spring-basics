package com.practice.spring.basics.springbasics;

import com.practice.spring.basics.springbasics.xml.XmlJdbcConnection;
import com.practice.spring.basics.springbasics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringBasicsXMLApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXMLApplication.class);
	
	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext springXMlApplicationContext
					= new ClassPathXmlApplicationContext("applicationContext.xml")
		){


			XmlPersonDAO xmlPersonDAOBean =  springXMlApplicationContext.getBean(XmlPersonDAO.class);

			XmlJdbcConnection result = xmlPersonDAOBean.getXmlJdbcConnection();
			LOGGER.info("{}",xmlPersonDAOBean);
		LOGGER.info("{}",result);
		 

		}
	}

}
