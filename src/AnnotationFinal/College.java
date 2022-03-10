package AnnotationFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component("collegeBean")*/



@Component
public class College {
	
	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
/*	public College(Principal principal) {
		this.principal = principal;
	} */
	
	
	
	/*@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("Using setPrincipal method");
	}
	*/
	
	public void test() 
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college Name is : " + collegeName);
		System.out.println("Testing this call methods.............!!!!!!!!!!!");
	}
	
	

}
