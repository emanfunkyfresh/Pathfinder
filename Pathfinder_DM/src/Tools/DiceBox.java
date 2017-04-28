package Tools;

public class DiceBox {

	public int roll(int num, int sides, int mod){
		if(num == 0)
			return mod;
		
		else
			return roll(num-1, sides, mod) + ((int)(Math.random()*sides)+1);
		
	}
	
}
