package KyriaLearningDepencyInjection;

public class Student3 {
	
private int id;
private String studentName;


public Student3(int id, String studentName) {
	this.id = id;
	this.studentName = studentName;
}


public void displayStudentInfo()
{
	System.out.println("Student name is : " + studentName + " and the id is : " + id);
}

	

}
