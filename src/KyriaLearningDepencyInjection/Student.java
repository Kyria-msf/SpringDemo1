package KyriaLearningDepencyInjection;

public class Student {
	private int id;
	private String studentName;
	
	/* Setter Injection */
	
	/*
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */

	/* Construction Injection*/
	
	
	
	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName+ "and id is " + id);
	}

	public Student(int id, String studentName) {

		this.id = id;
		this.studentName = studentName;
	}

	
	
}
