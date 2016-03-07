package robotMain;

public class Movement1 {

	Integer moveRobot(Integer move){
		
		switch(move){
			case 1:
				move -= 10;
				System.out.println("moved to the left a couple feet.");
				return move;
			case 2:
				move -= 10;
				System.out.println("moved to the right a couple feet.");
				return move;
			case 3:
				move -= 10;
				System.out.println("moved forward a couple feet.");
				return move;
			case 4:
				move -= 10;
				System.out.println("moved backward a couple feet.");
				return move;
			case 5:
				move += 30;
				System.out.println("Recharged by 30%");
				return move;
			default:
				return move;
		
		}
	}
}
