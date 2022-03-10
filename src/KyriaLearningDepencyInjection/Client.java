package KyriaLearningDepencyInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	
	public static void main(String[] args)
	{
	/*	Student4 student = new Student4();
		student.cheating();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cheat.xml");
		System.out.println("beans.xml file loaded");
		Student4 student = context.getBean("stu", Student4.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
		
	}

}
