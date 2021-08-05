package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.ScrollPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;

public class Partida {

	private JFrame frame;
	private JTextField txtT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partida window = new Partida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Partida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel ahorcado = new JPanel();
		ahorcado.setBorder(new LineBorder(Color.BLACK));
		ahorcado.setBounds(401, 11, 273, 439);
		ahorcado.setBackground(Color.GRAY);
		frame.getContentPane().add(ahorcado);
		ahorcado.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.GRAY);
		menu.setBorder(new LineBorder(Color.BLACK));
		menu.setBounds(10, 11, 381, 118);
		frame.getContentPane().add(menu);
		menu.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar Juego");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(33, 8, 300, 46);
		menu.add(btnNewButton);
		
		JButton btnResolverJuego = new JButton("Resolver Juego");
		btnResolverJuego.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnResolverJuego.setBounds(33, 62, 300, 46);
		menu.add(btnResolverJuego);
		
		JPanel palabraSecreta = new JPanel();
		palabraSecreta.setBorder(new LineBorder(Color.BLACK));
		palabraSecreta.setBackground(Color.GRAY);
		palabraSecreta.setBounds(10, 141, 381, 130);
		frame.getContentPane().add(palabraSecreta);
		palabraSecreta.setLayout(null);
		
		JTextPane txtpnPalabraSecreta = new JTextPane();
		txtpnPalabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPalabraSecreta.setText("Palabra secreta");
		txtpnPalabraSecreta.setBackground(Color.GRAY);
		txtpnPalabraSecreta.setBounds(10, 53, 99, 23);
		palabraSecreta.add(txtpnPalabraSecreta);
		
		txtT = new JTextField();
		txtT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtT.setForeground(Color.WHITE);
		txtT.setBackground(Color.BLACK);
		txtT.setBounds(10, 81, 300, 38);
		palabraSecreta.add(txtT);
		txtT.setColumns(10);
		
		JPanel letras = new JPanel();
		letras.setBorder(new LineBorder(Color.BLACK));
		letras.setBackground(Color.GRAY);
		letras.setBounds(10, 282, 381, 168);
		frame.getContentPane().add(letras);
		letras.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(18, 8, 56, 23);
		letras.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setActionCommand("B");
		btnB.setBounds(88, 8, 56, 23);
		letras.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(160, 8, 56, 23);
		letras.add(btnC);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(304, 8, 56, 23);
		letras.add(btnE);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(232, 8, 56, 23);
		letras.add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(18, 39, 56, 23);
		letras.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(88, 39, 56, 23);
		letras.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(160, 39, 56, 23);
		letras.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(232, 39, 56, 23);
		letras.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(304, 39, 56, 23);
		letras.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(16, 70, 56, 23);
		letras.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(88, 70, 56, 23);
		letras.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(160, 70, 56, 23);
		letras.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(232, 70, 56, 23);
		letras.add(btnN);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(304, 70, 56, 23);
		letras.add(btnÑ);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(16, 101, 56, 23);
		letras.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(88, 101, 56, 23);
		letras.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(160, 101, 56, 23);
		letras.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(232, 101, 56, 23);
		letras.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(304, 101, 56, 23);
		letras.add(btnS);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(68, 132, 56, 23);
		letras.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(130, 132, 56, 23);
		letras.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(192, 132, 56, 23);
		letras.add(btnX);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(6, 132, 56, 23);
		letras.add(btnT);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(254, 132, 56, 23);
		letras.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(316, 132, 56, 23);
		letras.add(btnZ);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
