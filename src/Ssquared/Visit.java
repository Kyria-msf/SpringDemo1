package Ssquared;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Visit {
	
	public static void main (String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("squared.xml");
		System.out.println("squared. xml loading ....");
		
		Developer develop = context.getBean("dev",Developer.class);
		develop.getCountry();
		
				
		
	}

}
