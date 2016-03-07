package robotMain;

public class Battery {
	
	public Integer charge(Integer energy){
		
		if(energy > 100){
			System.out.println(
				"Your robot is already fully charged.");
			return energy = 100;
		}else if(energy <= 0){
			System.out.println(
				"You've burned out your robots' battery...you'll have to\n"
						+"use it another day.");
			return energy = 0;
		}else{
			return energy;
		}
	}
}
