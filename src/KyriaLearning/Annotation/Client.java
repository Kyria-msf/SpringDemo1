package KyriaLearning.Annotation;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml file loaded");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : " + college);
		college.test();
		context.close();
		//((AnnotationConfigApplicationContext)context).close();
	}

}
