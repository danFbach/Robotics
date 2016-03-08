package robotMain;
import java.util.Scanner;
public class RobotMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Integer remainingEnergy = 100;
		Integer userChoice = 0;
		Integer decider1;
		String nameChoice;
		
		InitialStatement first = new InitialStatement();
		Movement1 move1 = new Movement1();
		Battery check = new Battery();
		Movement2 move2 = new Movement2();
		RobotName namePick = new RobotName();
		
		
		
		
		
		System.out.println("Here's your new remote controlled robot sir..."); 
		
		while(remainingEnergy > 0){

			System.out.println("insert robot name: Fixer, Breaker or Maker");
			nameChoice = scan.nextLine();
			nameChoice = namePick.nameClass(nameChoice);
			
			System.out.println(first.beginning(null));
			
			
			
			
			decider1 = scan.nextInt();
			userChoice = move1.moveRobot(decider1);
			userChoice += remainingEnergy - decider1;
			remainingEnergy = userChoice;
			
			remainingEnergy = check.charge(remainingEnergy);
			
			System.out.println(
				"\nYour robot has " + remainingEnergy
				+ "% battery remaining.\n");
		}
	}
}