package com.java.game.ahorcado_Didac_David;

import java.awt.EventQueue;

import vista.Main;

/**
 * Hello world!
 *
 */
public class App {
	static Main main = null;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = new Main();
					main.setFrame(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
