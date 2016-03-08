package robotMain;

public class Movement2 {

public Integer moveRobot(Integer move){
		
		switch(move){
			case 1:
				move -= 10;
				System.out.println("Pizza -- is -- ready.");
				return move;
			case 2:
				move -= 20;
				System.out.println("Brake -- replacement -- complete.");
				return move;
			case 3:
				move -= 15;
				System.out.println("BEWWWWWW....I - always - hated - that - robot - too - sir.");
				return move;
			case 4:
				move -= 15;
				System.out.println("I agree sir...The police are useless, let me take care of this.");
				return move;
			case 5:
				move += 25;
				System.out.println("Recharged by 25%");
				return move;
			default:
				return move;
		
		}
	}
}
