package com.java.game.ahorcado_Didac_David;

import java.awt.EventQueue;

import vista.Menu;

/**
 * Hello world!
 *
 */
public class App {
	static Menu main = null;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = new Menu();
					main.setFrame(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
