package KyriaLearningDepencyInjection;

public class Student2 {
	
	private String studentName;
	private int id;
	
	
	
	public void setId(int id) {
		this.id = id;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void displayStudentInfo()
	{
		System.out.println("Student name is : " + studentName + "  and the id is : " + id);
	}

}
