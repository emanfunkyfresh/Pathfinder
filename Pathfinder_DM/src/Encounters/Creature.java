package Encounters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;


public class Creature {
	
	CSVReader reader;
	
	public Creature() throws FileNotFoundException{
		reader = new CSVReader(new FileReader("/home/eddmcmuffin/Pathfinder/Databases/csvFiles/Bestiary.csv"));

	}
	
	
	public String[] getRandomMonster(int roll) throws IOException{
		
		for(int i=0; i<roll;i++)
			reader.iterator().next();
		
		return reader.readNext();
		
	}

	public String[] getHeader() throws IOException {
		return reader.readNext();
	}


	public int getSize() throws IOException {
		// TODO Auto-generated method stub
		return reader.readAll().size();
	}
	
	
}
