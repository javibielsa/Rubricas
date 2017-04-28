package Rubrica26;

import java.util.Random;

public class Container {
	String property;

	
	public Container(){
		
	int numRandon = (int) Math.round(Math.random() * 26 ) ;	
	String abecedario[]= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N","Ñ","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
		
	Random random = new Random();
	property = abecedario[numRandon]+random.nextInt(100);
	}
	
	public String getProperty(){
		return property;
	}
}
