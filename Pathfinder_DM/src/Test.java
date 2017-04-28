import java.io.FileNotFoundException;
import java.io.IOException;

import Encounters.Creature;
import Tools.*;


public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		DiceBox db = new DiceBox();
		Creature c =new Creature();
		
		String [] header= c.getHeader();
		String [] monster = c.getRandomMonster(db.roll(1,5000,-2)); 
		
		
		for(int i = 0; i < monster.length; i++){
			if(!(monster[i].equals(" ")||(monster[i].equals(""))))
				System.out.print(header[i]+":"+monster[i]+"\t");
			
		}
	}

}
