package Musafiri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import AnnotationFinal.Principal;

@Component("college")
public class College {

	/*@Value
	private String name;*/
	
	@Autowired
	private Principal  principal;
	
	@Autowired
	private Teacher teacher;
	
	
	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing this called method...............!!!!!!!!!!!!!!!!!");
	}
	
}
