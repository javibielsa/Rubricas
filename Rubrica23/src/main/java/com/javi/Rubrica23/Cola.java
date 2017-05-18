package com.javi.Rubrica23;

import java.util.ArrayList;
import java.util.List;

public class Cola<E> {
	List<E> FIFO;

	public Cola() {
		FIFO = new ArrayList<E>();
	}

	public void encolar(E e) {
		FIFO.add(e);
	}

	public E desencolar() {
		try {
			E devolver = FIFO.get(0);
			FIFO.remove(0);
			return devolver;
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("No existe un carácter en esa posición");
			return null;
		}
	}
	
	public int numElementos(){
		return FIFO.size();
	}
}
