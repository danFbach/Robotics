package robotMain;
import java.util.Scanner;

public class RobotName {
	
	Scanner scan = new Scanner(System.in);
	
	String nameClass(String nameChoice){
	
	nameChoice = nameChoice.toLowerCase();
		if(nameChoice == "fixer"){
			System.out.println(nameChoice);
			
		}else if(nameChoice == "breaker"){
			System.out.println(nameChoice);
			
		}else if(nameChoice == "Maker"){			
			System.out.println(nameChoice);

		}else {
			System.out.println("We don't have any robots by that name.");
		}	
	return nameChoice;
	}

}
