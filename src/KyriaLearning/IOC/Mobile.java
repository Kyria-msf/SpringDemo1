package KyriaLearning.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	
	public static void main(String[] args) {
	
     	
		ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
		System.out.print("Config loaded");
		/*
		 * Airtel air = (Airtel) context.getBean("airtel"); air.calling(); air.data();
		 */
		/*
		 * Vodacom voda = context.getBean("vodacom",Vodacom.class); voda.calling();
		 * voda.data();
		 */
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}
}
