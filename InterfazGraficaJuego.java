package com.jarroba.Juego2.AHORCADO;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class InterfazGraficaJuego extends JFrame{
	
	private JPanel contentPane;
	
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
	JButton Resolver = new JButton("Resolver");
	JTextField palabraSecreta = new JTextField();
	JPanel fotoS = new JPanel();
	//TECLADO
	JButton A = new JButton("A");
	JButton B = new JButton("B");
	JButton C = new JButton("C");
	JButton D = new JButton("D");
	JButton E = new JButton("E");
	JButton F = new JButton("F");
	JButton G = new JButton("G");
	JButton H = new JButton("H");
	JButton I = new JButton("I");
	JButton J = new JButton("J");
	JButton K = new JButton("K");
	JButton L = new JButton("L");
	JButton M = new JButton("M");
	JButton N = new JButton("N");
	JButton Ñ = new JButton("Ñ");
	JButton O = new JButton("O");
	JButton P = new JButton("P");
	JButton Q = new JButton("Q");
	JButton R = new JButton("R");
	JButton S = new JButton("S");
	JButton T = new JButton("T");
	JButton U = new JButton("U");
	JButton V = new JButton("V");
	JButton W = new JButton("W");
	JButton X = new JButton("X");
	JButton Y = new JButton("Y");
	JButton Z = new JButton("Z");
	
	//POSICIONAMOS EL CONTENIDO
	Iniciar.setBounds(10,30,414,40);
	Resolver.setBounds(10,72,414,40);
	menu.setBounds(10,5,40,30);
	palabraS.setBounds(10,150,100,30);
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
	
}

}
