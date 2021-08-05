package code;

import java.util.ArrayList;

public class ListaPalabras {
	
	private ArrayList<String> list;
	
	public ListaPalabras() {
		list=iniciarLista();
	}
	
	// Este metodo iniciara la lista con las palabras por defecto.
	private ArrayList<String> iniciarLista() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ALGO");
		list.add("QUIZA");
		return list;
	}

	// Zona de getters and setters.
	public String getList(int num) {
		return list.get(num);
	}
	
	public int getListSize() {
		return list.size() - 1;
	}

	public void setList(String list) {
		this.list.add(list.toUpperCase());
	}
	
	

}
