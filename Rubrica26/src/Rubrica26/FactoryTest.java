package Rubrica26;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void createListTest() {
		Factory factoria = new Factory();
		List<Container> cont = new ArrayList<Container>();
		cont = factoria.createList();
		
		for (int i = 0; i < cont.size(); i++) {
			for (int j = i+1; j < cont.size(); j++) {
				assertTrue(cont.get(i).getProperty() != cont.get(j).getProperty());
			}
		}
		
	}

}