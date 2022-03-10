package KyriaLearningDepencyInjection;


public class AnotherStudent {
	

	private MathCheat cheat;
	
	public void startCheating() {
		cheat.mathCheat();
	}

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
}
