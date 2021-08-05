package com.jarroba.Juego2.AHORCADO;

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
	
	setBounds(400,400,550,500);
	
	//CREAMOS EL CONTENIDO
	JLabel menu = new JLabel("MENU");
	JButton Iniciar = new JButton("Iniciar Juego");
	JButton Resolver = new JButton("Resolver");
	
	//POSICIONAMOS EL CONTENIDO
	Iniciar.setBounds(10,7,300,40);
	Resolver.setBounds(10,49,300,40);
	menu.setBounds(10,4,20,30);
	
	//AÑDIMOS EL CONTENIDO
	contentPane.add(Iniciar);
	contentPane.add(Resolver);
	contentPane.add(menu);
}

}
