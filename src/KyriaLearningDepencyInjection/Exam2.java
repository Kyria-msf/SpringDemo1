package KyriaLearningDepencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam2 {
	
	public static void main(String[] args) {
		
		
	/*	Student2 student = new Student2();
		student.setStudentName("Justin");
		
		student.displayStudentInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Exam2.xml");
		Student2 just = context.getBean("student2", Student2.class);
		just.displayStudentInfo();
		
		Student2 fatuma = context.getBean("Fatuma", Student2.class);
		fatuma.displayStudentInfo();
		
	
	}

}
