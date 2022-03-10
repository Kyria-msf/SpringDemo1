package AllInjectionInOne;

public class Student {
	/*private MathCheat mathCheat;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
	}*/
	
	private Cheat cheat;


	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}



	public void cheating() {
		cheat.cheat();
		
	}
}
