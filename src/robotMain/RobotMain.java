package robotMain;
import java.util.Scanner;
public class RobotMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Integer remainingEnergy = 100;
		Integer userChoice = 0;
		Integer decider1;
//		Integer left = 0;
//		
//		Battery	battLevel = new Battery();
		Movement1 move1 = new Movement1();
		System.out.println("Here's your new remote controlled robot sir..."); 
		
		while(remainingEnergy > 0){
			
			System.out.println("There's a few things you can do with you new robot...\n"
					+ "1 - Move Left.\n"
					+ "2 - Move Right.\n"
					+ "3 - Move forward.\n"
					+ "4 - Move Backward.\n"
					+ "5 - Charge Battery\n"
					+ "Current battery level is: " + remainingEnergy + "%.");
			
			decider1 = scan.nextInt();
			userChoice = move1.moveRobot(decider1);
			userChoice += remainingEnergy - decider1;
			remainingEnergy = userChoice;
						
//				remainingEnergy = move1.moveLeft(userChoice);
				System.out.println(remainingEnergy);
			if(remainingEnergy > 100){remainingEnergy = 100; System.out.println("Your robot is already fully charged.");}
						
		}
	}
}
