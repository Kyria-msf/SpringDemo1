package Fatuma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("fatuma.xml");
		
		/*Cheat cheating = context.getBean("cheatingus", Cheat.class);
		
		//System.out.print("Config loading..........!!!!!!!!!");
		//System.out.print("Hello");
		
		cheating.cheatingStarted ();
		*/
		
		Student student = context.getBean("cheatingus",Student.class);
		
		System.out.println("Config loading..........!!!!!!!!!!");
		student.displayCheating();
		
	}
	

}
