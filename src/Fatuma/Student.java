package Fatuma;

public class Student {

	
	private String name;
	private int StudentNumber;
	private Cheat cheat;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	
	public void displayCheating()
	{
		cheat.cheatingStarted();
		cheat.finishCheating();
	}
	
}
