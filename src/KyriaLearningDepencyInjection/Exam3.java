package KyriaLearningDepencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam3 {
	
	public static void main(String[] args) {
		// This things is done manually
		
		/*Student3 kyria = new Student3(1, "My lovely Kyria");
		kyria.displayStudentInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Exam3.xml");
		
		Student3 fatuma = context.getBean("student3", Student3.class);
		fatuma.displayStudentInfo();
		
		
		/* Student kyria = context.getBean("kyria", Student.class);
		kyria.displayStudentInfo(); */
				
	}

}
