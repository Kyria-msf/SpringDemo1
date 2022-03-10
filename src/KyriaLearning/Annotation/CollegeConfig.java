package KyriaLearning.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "KyriaLearning.Annotation")
public class CollegeConfig {
	
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		
		return new Principal();
	}
	
	@Bean
	public College collegeBean() // this one will be my Bean ID
	{
		//College college = new College(principalBean());
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return  college;
	}

}
