package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import code.ListaPalabras;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Partida {

	public JFrame frame;
	private JTextField txtPalabra;
	private String secreto;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnM;
	private JButton btnN;
	private JButton btnÑ;
	private JButton btnO;
	private JButton btnP;
	private JButton btnQ;
	private JButton btnR;
	private JButton btnS;
	private JButton btnT;
	private JButton btnU;
	private JButton btnV;
	private JButton btnW;
	private JButton btnX;
	private JButton btnY;
	private JButton btnZ;
	private JTextPane numIntentos;
	private JTextPane numVidas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partida partida = new Partida();
					partida.frame.setVisible(true);
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
		iniciarSecreto(Main.list, true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);

		JPanel ahorcado = new JPanel();
		ahorcado.setBorder(new LineBorder(Color.BLACK));
		ahorcado.setBackground(Color.GRAY);

		JPanel menu = new JPanel();
		menu.setBackground(Color.GRAY);
		menu.setBorder(new LineBorder(Color.BLACK));

		JButton btnIniciar = new JButton("Iniciar Juego");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JButton btnResolver = new JButton("Resolver Juego");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JPanel palabraSecreta = new JPanel();
		palabraSecreta.setBorder(new LineBorder(Color.BLACK));
		palabraSecreta.setBackground(Color.GRAY);

		JTextPane txtpnPalabraSecreta = new JTextPane();
		txtpnPalabraSecreta.setEditable(false);
		txtpnPalabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPalabraSecreta.setText("Palabra secreta");
		txtpnPalabraSecreta.setBackground(Color.GRAY);

		txtPalabra = new JTextField();
		txtPalabra.setEditable(false);
		txtPalabra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPalabra.setForeground(Color.WHITE);
		txtPalabra.setBackground(Color.BLACK);
		txtPalabra.setColumns(10);

		JPanel letras = new JPanel();
		letras.setBorder(new LineBorder(Color.BLACK));
		letras.setBackground(Color.GRAY);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(10)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(menu, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
						.addComponent(palabraSecreta, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
						.addComponent(letras, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
				.addGap(10).addComponent(ahorcado, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(11)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addComponent(menu, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(palabraSecreta, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(letras, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
						.addComponent(ahorcado, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE))));
		GroupLayout gl_menu = new GroupLayout(menu);
		gl_menu.setHorizontalGroup(gl_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menu.createSequentialGroup().addGap(32)
						.addGroup(gl_menu.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnIniciar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnResolver, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300,
										Short.MAX_VALUE))));
		gl_menu.setVerticalGroup(gl_menu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menu.createSequentialGroup().addGap(7)
						.addComponent(btnIniciar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE).addGap(8)
						.addComponent(btnResolver, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)));
		menu.setLayout(gl_menu);

		JTextPane txtpnIntentos = new JTextPane();
		txtpnIntentos.setEditable(false);
		txtpnIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnIntentos.setText("Intentos:");
		txtpnIntentos.setBackground(Color.GRAY);

		numIntentos = new JTextPane();
		numIntentos.setEditable(false);
		numIntentos.setBackground(Color.GRAY);
		numIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numIntentos.setText("10");
		GroupLayout gl_ahorcado = new GroupLayout(ahorcado);
		gl_ahorcado.setHorizontalGroup(gl_ahorcado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ahorcado.createSequentialGroup().addGap(9)
						.addComponent(txtpnIntentos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(2).addComponent(numIntentos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)));
		gl_ahorcado.setVerticalGroup(gl_ahorcado.createParallelGroup(Alignment.LEADING).addGroup(gl_ahorcado
				.createSequentialGroup().addGap(10)
				.addGroup(gl_ahorcado.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnIntentos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(numIntentos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))));
		ahorcado.setLayout(gl_ahorcado);

		JTextPane txtpnVidas = new JTextPane();
		txtpnVidas.setEditable(false);
		txtpnVidas.setText("Vidas:");
		txtpnVidas.setBackground(Color.GRAY);
		txtpnVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));

		numVidas = new JTextPane();
		numVidas.setEditable(false);
		numVidas.setBackground(Color.GRAY);
		numVidas.setText("5");
		numVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_palabraSecreta = new GroupLayout(palabraSecreta);
		gl_palabraSecreta.setHorizontalGroup(gl_palabraSecreta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_palabraSecreta.createSequentialGroup().addGap(9)
						.addGroup(gl_palabraSecreta.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_palabraSecreta.createSequentialGroup()
										.addComponent(txtpnVidas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(1).addComponent(numVidas, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtpnPalabraSecreta, GroupLayout.PREFERRED_SIZE, 158,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPalabra, GroupLayout.PREFERRED_SIZE, 300,
										GroupLayout.PREFERRED_SIZE))));
		gl_palabraSecreta.setVerticalGroup(gl_palabraSecreta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_palabraSecreta.createSequentialGroup().addGap(10)
						.addGroup(gl_palabraSecreta.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnVidas, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(numVidas, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGap(11)
						.addComponent(txtpnPalabraSecreta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(1)
						.addComponent(txtPalabra, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)));
		palabraSecreta.setLayout(gl_palabraSecreta);

		btnA = new JButton("A");
		btnA.setBorder(new LineBorder(Color.DARK_GRAY));

		btnB = new JButton("B");
		btnB.setBorder(new LineBorder(Color.DARK_GRAY));

		btnC = new JButton("C");
		btnC.setBorder(new LineBorder(Color.DARK_GRAY));

		btnD = new JButton("D");
		btnD.setBorder(new LineBorder(Color.DARK_GRAY));

		btnE = new JButton("E");
		btnE.setBorder(new LineBorder(Color.DARK_GRAY));

		btnG = new JButton("G");
		btnG.setBorder(new LineBorder(Color.DARK_GRAY));

		btnH = new JButton("H");
		btnH.setBorder(new LineBorder(Color.DARK_GRAY));

		btnI = new JButton("I");
		btnI.setBorder(new LineBorder(Color.DARK_GRAY));

		btnJ = new JButton("J");
		btnJ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnK = new JButton("K");
		btnK.setBorder(new LineBorder(Color.DARK_GRAY));

		btnM = new JButton("M");
		btnM.setBorder(new LineBorder(Color.DARK_GRAY));

		btnN = new JButton("N");
		btnN.setBorder(new LineBorder(Color.DARK_GRAY));

		btnÑ = new JButton("Ñ");
		btnÑ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnO = new JButton("O");
		btnO.setBorder(new LineBorder(Color.DARK_GRAY));

		btnP = new JButton("P");
		btnP.setBorder(new LineBorder(Color.DARK_GRAY));

		btnF = new JButton("F");
		btnF.setBorder(new LineBorder(Color.DARK_GRAY));

		btnW = new JButton("W");
		btnW.setBorder(new LineBorder(Color.DARK_GRAY));

		btnX = new JButton("X");
		btnX.setBorder(new LineBorder(Color.DARK_GRAY));

		btnY = new JButton("Y");
		btnY.setBorder(new LineBorder(Color.DARK_GRAY));

		btnZ = new JButton("Z");
		btnZ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnR = new JButton("R");
		btnR.setBorder(new LineBorder(Color.DARK_GRAY));

		btnS = new JButton("S");
		btnS.setBorder(new LineBorder(Color.DARK_GRAY));

		btnT = new JButton("T");
		btnT.setBorder(new LineBorder(Color.DARK_GRAY));

		btnU = new JButton("U");
		btnU.setBorder(new LineBorder(Color.DARK_GRAY));

		btnV = new JButton("V");
		btnV.setBorder(new LineBorder(Color.DARK_GRAY));

		btnQ = new JButton("Q");
		btnQ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnL = new JButton("L");
		btnL.setBorder(new LineBorder(Color.DARK_GRAY));
		GroupLayout gl_letras = new GroupLayout(letras);
		gl_letras.setHorizontalGroup(gl_letras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_letras.createSequentialGroup().addGap(10)
						.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnF, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_letras.createSequentialGroup().addGap(10)
						.addComponent(btnG, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnI, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnJ, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnK, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_letras.createSequentialGroup().addGap(10)
						.addComponent(btnM, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnN, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnÑ, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnO, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnP, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnQ, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_letras.createSequentialGroup().addGap(20)
						.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(21)
						.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(21)
						.addComponent(btnT, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(21)
						.addComponent(btnU, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(21)
						.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_letras.createSequentialGroup().addGap(71)
						.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnY, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnZ, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)));
		gl_letras.setVerticalGroup(gl_letras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_letras.createSequentialGroup().addGap(2)
						.addGroup(gl_letras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(3)
						.addGroup(gl_letras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnG, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnI, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnJ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnK, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnL, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(3)
						.addGroup(gl_letras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnM, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnÑ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnO, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnQ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(3)
						.addGroup(gl_letras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnU, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(3)
						.addGroup(gl_letras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnY, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnZ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))));
		letras.setLayout(gl_letras);
		panel.setLayout(gl_panel);

		// Acciones de los botones.

		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarSecreto(Main.list, true);
			}
		});

		btnResolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameOver();
			}
		});

		btnA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnA.setEnabled(false);
				comparaSecreto('A');
			}
		});

		btnB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnB.setEnabled(false);
				comparaSecreto('B');
			}
		});

		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnC.setEnabled(false);
				comparaSecreto('C');
			}
		});

		btnD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnD.setEnabled(false);
				comparaSecreto('D');
			}
		});

		btnE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnE.setEnabled(false);
				comparaSecreto('E');
			}
		});

		btnF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnF.setEnabled(false);
				comparaSecreto('F');
			}
		});

		btnG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnG.setEnabled(false);
				comparaSecreto('G');
			}
		});

		btnH.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnH.setEnabled(false);
				comparaSecreto('H');
			}
		});

		btnI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnI.setEnabled(false);
				comparaSecreto('I');
			}
		});

		btnJ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnJ.setEnabled(false);
				comparaSecreto('J');
			}
		});

		btnK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnK.setEnabled(false);
				comparaSecreto('K');
			}
		});

		btnL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnL.setEnabled(false);
				comparaSecreto('L');
			}
		});

		btnM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnM.setEnabled(false);
				comparaSecreto('M');
			}
		});

		btnN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnN.setEnabled(false);
				comparaSecreto('N');
			}
		});

		btnÑ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnÑ.setEnabled(false);
				comparaSecreto('Ñ');
			}
		});

		btnO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnO.setEnabled(false);
				comparaSecreto('O');
			}
		});

		btnP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnP.setEnabled(false);
				comparaSecreto('P');
			}
		});

		btnQ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnQ.setEnabled(false);
				comparaSecreto('Q');
			}
		});

		btnR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnR.setEnabled(false);
				comparaSecreto('R');
			}
		});

		btnS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnS.setEnabled(false);
				comparaSecreto('S');

			}
		});

		btnT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnT.setEnabled(false);
				comparaSecreto('T');
			}
		});

		btnU.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnU.setEnabled(false);
				comparaSecreto('U');
			}
		});

		btnV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnV.setEnabled(false);
				comparaSecreto('V');
			}
		});

		btnW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnW.setEnabled(false);
				comparaSecreto('W');
			}
		});

		btnX.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnX.setEnabled(false);
				comparaSecreto('X');
			}
		});

		btnY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnY.setEnabled(false);
				comparaSecreto('Y');
			}
		});

		btnZ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnZ.setEnabled(false);
				comparaSecreto('Z');
			}
		});

	}

	// Este metodo reinicia el interruptor de las letras para que dejen de estar
	// seleccionadas, se ha decidido hacerlo un metodo aparte por si fuera necesario
	// usarlo en mas de un sitio y para no alargar en exceso el listener de iniciar
	// partida.
	private void letras() {
		btnA.setEnabled(true);
		btnB.setEnabled(true);
		btnC.setEnabled(true);
		btnD.setEnabled(true);
		btnE.setEnabled(true);
		btnF.setEnabled(true);
		btnG.setEnabled(true);
		btnH.setEnabled(true);
		btnI.setEnabled(true);
		btnJ.setEnabled(true);
		btnK.setEnabled(true);
		btnL.setEnabled(true);
		btnM.setEnabled(true);
		btnN.setEnabled(true);
		btnÑ.setEnabled(true);
		btnO.setEnabled(true);
		btnP.setEnabled(true);
		btnQ.setEnabled(true);
		btnR.setEnabled(true);
		btnS.setEnabled(true);
		btnT.setEnabled(true);
		btnU.setEnabled(true);
		btnV.setEnabled(true);
		btnW.setEnabled(true);
		btnX.setEnabled(true);
		btnY.setEnabled(true);
		btnZ.setEnabled(true);
	}

	// Este metodo rellenara de " " el string que representa la palabra secreta.
	private void textoSecreto() {
		String texto1 = "", texto2 = "_";

		for (int i = 0; i < this.secreto.length(); i++) {
			texto1 = texto1 + texto2;
		}
		txtPalabra.setText(texto1);
	}

	// Este metodo comprueba si la letra seleccionada se encuentra en la palabra
	// secreta.
	public void comparaSecreto(char letra) {
		String texto = txtPalabra.getText(), inteTxt = "", vidTxt = "";
		char[] tChar = texto.toCharArray();
		boolean sale = false;
		int inte = Integer.parseInt(numIntentos.getText()), vid = Integer.parseInt(numVidas.getText());

		for (int i = 0; i < this.secreto.length(); i++) {
			if (secreto.charAt(i) == letra) {
				tChar[i] = letra;
				sale = true;
			}
		}

		if (sale == false) {
			inte--;
		}

		if (inte == 0) {
			inte = 10;
			vid--;
		}

		if (vid < 0) {
			gameOver();
		} else {
			inteTxt = Integer.toString(inte);
			vidTxt = Integer.toString(vid);
			texto = String.valueOf(tChar);
			txtPalabra.setText(texto);
			numIntentos.setText(inteTxt);
			numVidas.setText(vidTxt);
		}
		if (!texto.contains("_")) {
			iniciarSecreto(Main.list, false);
			JOptionPane.showMessageDialog(null, "Felicidades, has adivinado la palabra,\nseleccionando otra palabra.");
		}
	}

	// Este metodo inicia partida, se ha decidido combertirlo en un metodo aparte
	// por que se usa en mas de un sitio.
	private void iniciarSecreto(ListaPalabras list, boolean vidas) {
		Random r = new Random();
		int r1 = r.nextInt((list.getListSize() - 0) + 1) + 0;
		letras();
		setSecreto(secreto = list.getList(r1));

		if (vidas == true) {
			numVidas.setText("5");
			numIntentos.setText("10");
		}

		textoSecreto();
	}

	// Este modulo se ejecuta cuando tenemos un game over (El jugador pierde todas
	// las vidas o se rinde.)
	private void gameOver() {
		JOptionPane.showMessageDialog(null,
				"Game Over\nLa palabra secreta era: " + this.secreto + "\nIniciando otra partida.");
		iniciarSecreto(Main.list, true);
	}

	// Getters y setters para la partida.
	public void setSecreto(String secreto) {
		this.secreto = secreto;
	}

	public String getSecreto() {
		return secreto;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean frame) {
		this.frame.setVisible(frame);
	}
}
