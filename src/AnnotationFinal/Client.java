package AnnotationFinal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*import org.springframework.context.support.ClassPathXmlApplicationContext;*/

public class Client {

	public static void main(String[] args) {
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationFi.xml");*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		/*System.out.println("AnnotationFi.xml file loaded");*/
		College college = context.getBean("college", College.class);
		System.out.println(" The college object created by spring is : " + college);
		college.test();
		context.close();
		
	}
}
