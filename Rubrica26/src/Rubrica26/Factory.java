package Rubrica26;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	

	public Factory(){
	}
	
	public List<Container> createList(){
		
		List<Container> contenedor = new ArrayList<Container>();
		for (int i = 0; i < 5; i++) {
			contenedor.add(new Container());
		}
		
	return contenedor;
	}
}