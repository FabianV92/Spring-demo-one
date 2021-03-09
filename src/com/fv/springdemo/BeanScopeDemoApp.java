package com.fv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextBean.xml");
		// Retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("myCoach adress: " + myCoach);
		System.out.println("alphaCoach adress: " + alphaCoach);
		// Closing the context
		context.close();
	}

}
