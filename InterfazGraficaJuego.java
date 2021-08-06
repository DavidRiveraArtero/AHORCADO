package com.jarroba.Juego2.AHORCADO;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.* ;

import PalabraRandom.PalabraRandom;

public class InterfazGraficaJuego extends JFrame{
	JTextField palabraSecreta;
	JButton Resolver;
	JTextPane NumVidas;
	private JPanel contentPane;
	//DEFINIMOS TODOS LOS BOTONES
	JButton A;
	JButton B;
	JButton C;
	JButton D;
	JButton E;
	JButton F;
	JButton G;
	JButton H;
	JButton I;
	JButton J;
	JButton K;
	JButton L;
	JButton M;
	JButton N;
	JButton Ñ;
	JButton O;
	JButton P;
	JButton Q;
	JButton R;
	JButton S;
	JButton T;
	JButton U;
	JButton V;
	JButton W;
	JButton X;
	JButton Y;
	JButton Z;
	private String sectro;
	private String oculto;
	
	InterfazGraficaJuego(){
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setVisible(true);
	
	contentPane=new JPanel();
	
	contentPane.setLayout(null);
	
	setContentPane(contentPane);
	
	setTitle("AHORCADO");
	
	setBounds(400,400,900,900);
	
	//CREAMOS EL CONTENIDO
	//MENU
	JLabel menu = new JLabel("MENU");
	JLabel palabraS = new JLabel("Palabra Secreta");
	JButton Iniciar = new JButton("Iniciar Juego");
	Resolver = new JButton("Resolver");
	palabraSecreta = new JTextField();
	NumVidas = new JTextPane();
	JLabel Tvidas = new JLabel("Vidas = ");
	JPanel fotoS = new JPanel();
	//TECLADO
	A = new JButton("A");
	B = new JButton("B");
	C = new JButton("C");
	D = new JButton("D");
	E = new JButton("E");
	F = new JButton("F");
	G = new JButton("G");
	H = new JButton("H");
	I = new JButton("I");
	J = new JButton("J");
	K = new JButton("K");
	L = new JButton("L");
	M = new JButton("M");
	N = new JButton("N");
	Ñ = new JButton("Ñ");
	O = new JButton("O");
	P = new JButton("P");
	Q = new JButton("Q");
	R = new JButton("R");
	S = new JButton("S");
	T = new JButton("T");
	U = new JButton("U");
	V = new JButton("V");
	W = new JButton("W");
	X = new JButton("X");
	Y = new JButton("Y");
	Z = new JButton("Z");
	
	//POSICIONAMOS EL CONTENIDO
	Iniciar.setBounds(10,30,414,40);
	Resolver.setBounds(10,72,414,40);
	menu.setBounds(10,5,40,30);
	NumVidas.setBounds(51,127,30,30);
	palabraS.setBounds(10,150,100,30);
	Tvidas.setBounds(12,127,300,38);
	palabraSecreta.setBounds(12,180,300,38);
	fotoS.setBounds(451,11,500,544);
	//BOTONES POSICION
	A.setBounds(10,300,80,40);
	B.setBounds(91,300,80,40);
	C.setBounds(172,300,80,40);
	D.setBounds(253,300,80,40);
	E.setBounds(334,300,80,40);
	F.setBounds(10,341,80,40);
	G.setBounds(91,341,80,40);
	H.setBounds(172,341,80,40);
	I.setBounds(253,341,80,40);
	J.setBounds(334,341,80,40);
	K.setBounds(10,382,80,40);
	L.setBounds(91,382,80,40);
	M.setBounds(172,382,80,40);
	N.setBounds(253,382,80,40);
	Ñ.setBounds(334,382,80,40);
	O.setBounds(10,422,80,40);
	P.setBounds(91,422,80,40);
	Q.setBounds(172,422,80,40);
	R.setBounds(253,422,80,40);
	S.setBounds(334,422,80,40);
	T.setBounds(10,462,80,40);
	U.setBounds(91,462,80,40);
	V.setBounds(172,462,80,40);
	W.setBounds(253,462,80,40);
	X.setBounds(334,462,80,40);
	Y.setBounds(10,502,80,40);
	Z.setBounds(91,502,80,40);
	
	//AÑDIMOS EL CONTENIDO
	contentPane.add(Iniciar);
	contentPane.add(Resolver);
	contentPane.add(menu);
	contentPane.add(NumVidas);
	contentPane.add(Tvidas);
	contentPane.add(palabraS);
	contentPane.add(palabraSecreta);
	contentPane.add(fotoS);
	//AÑADIR BOTONES
	contentPane.add(A);
	contentPane.add(B);
	contentPane.add(C);
	contentPane.add(D);
	contentPane.add(E);
	contentPane.add(F);
	contentPane.add(G);
	contentPane.add(H);
	contentPane.add(I);
	contentPane.add(J);
	contentPane.add(K);
	contentPane.add(L);
	contentPane.add(M);
	contentPane.add(N);
	contentPane.add(Ñ);
	contentPane.add(O);
	contentPane.add(P);
	contentPane.add(Q);
	contentPane.add(R);
	contentPane.add(S);
	contentPane.add(T);
	contentPane.add(U);
	contentPane.add(V);
	contentPane.add(W);
	contentPane.add(X);
	contentPane.add(Y);
	contentPane.add(Z);
	
	//FORMATO PALABRA SECRETA
	palabraSecreta.setFont(new Font("Tahoma",Font.PLAIN,20));
	palabraSecreta.setForeground(Color.WHITE);
	palabraSecreta.setBackground(Color.BLACK);
	
	//FORMATO JPANEL
	fotoS.setBackground(Color.gray);
	
	//FORMATO VIDAS
	NumVidas.setEditable(false);
	NumVidas.setText("5");

	
	
	//ACCION BOTON INICIAR
	Iniciar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//CREAMOS ARRAYLIST
			ArrayList PalabraSecreta = new ArrayList();
			PalabraSecreta.add("CASA");
			PalabraSecreta.add("PISO");
			
			
			int num1 = 0;
			int num2 = 1;
			int aleat = (int) Math.floor(Math.random()*(num2-num1+1)+num1);
			String Palabra = (String) PalabraSecreta.get(aleat);
			
			setSectro(sectro = Palabra);
				
			textoSecreto();
			Resolver.setEnabled(true);
			
		}
		
	});
	
	Resolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Te rendiste");
			
		}
	});
	
	
	A.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			
			char letra = 'A';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			A.setEnabled(false);
		}
	});
	
	B.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			
			char letra = 'B';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			B.setEnabled(false);
		}
	});
	
	C.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'C';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			C.setEnabled(false);
		}
	});
	
	D.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			
			char letra = 'D';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			D.setEnabled(false);
		}
	});
	
	E.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			
			char letra = 'E';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			E.setEnabled(false);
		}
	});
	
	F.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'F';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			F.setEnabled(false);
		}	
	});
	
	G.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'G';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			G.setEnabled(false);
		}	
	});
	
	H.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'H';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			H.setEnabled(false);
		}	
	});
	
	I.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'I';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			I.setEnabled(false);
		}	
	});
	
	J.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'J';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			J.setEnabled(false);
		}	
	});
	
	K.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'K';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			K.setEnabled(false);
		}	
	});
	
	L.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'L';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			L.setEnabled(false);
		}	
	});
	
	M.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'M';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			M.setEnabled(false);
		}	
	});
	
	N.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'N';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			N.setEnabled(false);
		}	
	});
	
	Ñ.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'Ñ';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			Ñ.setEnabled(false);
		}	
	});
	
	O.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'O';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			O.setEnabled(false);
		}	
	});
	
	P.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'P';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			P.setEnabled(false);
		}	
	});
	
	Q.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'Q';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			Q.setEnabled(false);
		}	
	});
	
	R.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'R';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			R.setEnabled(false);
		}	
	});
	
	S.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'S';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			S.setEnabled(false);
		}	
	});
	
	T.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'T';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			T.setEnabled(false);
		}	
	});
	
	U.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'U';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			U.setEnabled(false);
		}	
	});
	
	V.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'V';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			V.setEnabled(false);
		}	
	});
	
	W.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'W';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			W.setEnabled(false);
		}	
	});
	
	X.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'X';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			X.setEnabled(false);
		}	
	});
	
	Y.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'Y';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			Y.setEnabled(false);
		}	
	});
	
	Z.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String palabra = getSectro();
			char letra = 'Z';
			
			for (int x= 0; x < palabra.length(); x++) {
				if (letra == palabra.charAt(x)) {
					
					compararSecreto(letra);
				}else {
					compararSecreto(letra);
				}
			}
			Z.setEnabled(false);
		}	
	});
}
	//CREAMOS LA PALABRA OCULTA
	private void textoSecreto() {
		String texto1="",texto2=" ";
		for (int i =0; i<this.sectro.length();i++) {
			texto1 = texto1 + texto2;
		}
		palabraSecreta.setText(texto1);
	}

	//AÑADIMOS EL CONTENIDO A LA PALABRA OCULTA
	public void compararSecreto(char letra) {
		String texto = palabraSecreta.getText();
		char[] tChar = texto.toCharArray();
		boolean salir = false;
		
		for (int i =0; i<this.sectro.length();i++) {
			if (sectro.charAt(i)==letra) {
				tChar[i]=letra;
				salir = true;
			}else {
				int vidas = 5;
				vidas -=1;
				String vidasString = vidas +"";
				NumVidas.setText(vidasString);
			}
		}
		texto = String.valueOf(tChar);
		palabraSecreta.setText(texto);
		
		String palabra = getSectro();
		if (!texto.contains(" ")) {
			JOptionPane.showMessageDialog(null, "GANASTE");
			Resolver.setEnabled(false);
			
		}
	}
	


	public String getSectro() {
		return sectro;
	}

	public void setSectro(String sectro) {
		this.sectro = sectro;
	}

	public String getOculto() {
		return oculto;
	}

	public void setOculto(String oculto) {
		this.oculto = oculto;
	}
	
	
}
