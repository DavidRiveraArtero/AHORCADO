package code;

import java.util.ArrayList;

public class ListaPalabras {

	private ArrayList<String> list;

	public ListaPalabras() {
		list = iniciarLista();
	}

	// Este metodo iniciara la lista con las palabras por defecto.
	private ArrayList<String> iniciarLista() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ALGO");
		list.add("QUIZA");
		list.add("PIZZA");
		list.add("QUESO");
		list.add("JUEGO");
		list.add("PERRO");
		list.add("ZORRO");
		list.add("PIEDRA");
		list.add("ELECTRICIDAD");
		list.add("CAMION");
		return list;
	}

	// Zona de getters and setters.
	public String getList(int num) {
		return list.get(num);
	}

	public int getListSize() {
		return list.size() - 1;
	}

	public void setList(String palabra) {
		this.list.add(palabra.toUpperCase());
	}

}
