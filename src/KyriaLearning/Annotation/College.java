package KyriaLearning.Annotation;
import org.springframework.stereotype.Component;


/*@Component("collegeBean")*/
public class College {
	
	private Principal principal;
	
	// This teacher is an interface
	private Teacher teacher;
	
/*	public College(Principal principal) {
	
		this.principal = principal;
	}
	*/

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("testing this call methods");
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

}
