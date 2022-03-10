package SsquaredAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("fatuma.xml");
		System.out.println("fatuma.xml file loaded");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : " + college);
		
		
	}
}


