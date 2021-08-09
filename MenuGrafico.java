package com.jarroba.Juego2.AHORCADO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.* ;
public class MenuGrafico extends JFrame{
	private JPanel contentPane;
	JButton boton1;
	JButton boton2;
	
	 
	
	public MenuGrafico() {
		//CUANDO LE DEMOS A LA X SE CERRARA LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		//HACEMOS QUE LA VENTANA SEA VISIBLE
		setVisible(true);
		
		//COLOR FONDO:
		getContentPane().setBackground(Color.darkGray);
		
		//CREAMOS EL PANEL
		contentPane = new JPanel();
		
		//INDICAMOS SU DISEÑO
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//AñÑADIMOS TITULO A LA VENTANA
		setTitle("Ventana con interaccion");
		
		//TAMAÑO DE LA VENTANA
		setBounds(450,400,470,400);
		
		//CREANDO EL CONTENIDO
		boton1 = new JButton("Iniciar Partida");
		
		//POSICION BOTON
		boton1.setBounds(10,20,200,20);
		
		//AÑADIR CONTENIDO
		contentPane.add(boton1);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				InterfazGraficaJuego interfaz = new InterfazGraficaJuego();
				
			}
		});
	}

}
