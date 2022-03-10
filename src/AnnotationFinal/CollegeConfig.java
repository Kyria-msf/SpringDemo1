package AnnotationFinal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan(basePackages = "AnnotationFinal")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	
	/*@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	@Bean
	public College collegeBean()
	{
		/*College college = new College(principalBean());*/
		//College college = new College();
		//college.setPrincipal(principalBean());
		//college.setTeacher(mathTeacherBean());
		
		//return college;
		
		//return new College();
	}
	
	


