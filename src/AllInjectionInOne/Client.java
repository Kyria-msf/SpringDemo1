package AllInjectionInOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AllInjectionInOne.xml");
		System.out.println("AllInjectionInOne.xml file loaded");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
	}
}
