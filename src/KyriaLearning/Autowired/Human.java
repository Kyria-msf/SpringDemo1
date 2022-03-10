package KyriaLearning.Autowired;
import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;
	
	public Human() {
		
	}
	
	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constr is getting called which has Heart as arg");
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("");
	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
		}else
		{
			System.out.print("you are dead");
		}
		heart.pump();
	}
	

}
