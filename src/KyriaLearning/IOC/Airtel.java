package KyriaLearning.IOC;

public class Airtel implements Sim {
	
	/*
	 * public Airtel() { System.out.println("airtel constr called"); }
	 */
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using airtel mobile");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing internet using airtel sim");
	}
}
