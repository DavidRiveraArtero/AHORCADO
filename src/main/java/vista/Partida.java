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
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

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
	private JTextPane numVidas;
	private JLabel lblAhorcado;
	private JButton btnPista;
	private int inte = 0, inte2 = 0, vid = 0;
	private JTextPane txtpnPistas;
	private JButton btnPedirPista;
	private JButton btnVolverAlMenu;
	private JPanel fDifi;
	private JRadioButton rdbtnPri;
	private JRadioButton rdbtnInt;
	private JRadioButton rdbtnAv;
	private ButtonGroup group;
	private JButton btnOk;

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
		selecDificultad();
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
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 694, 471);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);

		JPanel ahorcado = new JPanel();
		ahorcado.setBounds(401, 11, 273, 439);
		ahorcado.setBorder(new LineBorder(Color.BLACK));
		ahorcado.setBackground(Color.GRAY);

		JPanel menu = new JPanel();
		menu.setBounds(10, 11, 381, 118);
		menu.setBackground(Color.GRAY);
		menu.setBorder(new LineBorder(Color.BLACK));

		JButton btnIniciar = new JButton("Iniciar Juego");
		btnIniciar.setBounds(25, 8, 153, 46);
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JButton btnResolver = new JButton("Resolver Juego");
		btnResolver.setBounds(25, 62, 153, 46);
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JPanel palabraSecreta = new JPanel();
		palabraSecreta.setBounds(10, 140, 381, 311);
		palabraSecreta.setBorder(new LineBorder(Color.BLACK));
		palabraSecreta.setBackground(Color.GRAY);

		JTextPane txtpnPalabraSecreta = new JTextPane();
		txtpnPalabraSecreta.setBounds(10, 49, 158, 31);
		txtpnPalabraSecreta.setEditable(false);
		txtpnPalabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPalabraSecreta.setText("Palabra secreta");
		txtpnPalabraSecreta.setBackground(Color.GRAY);

		txtPalabra = new JTextField();
		txtPalabra.setBounds(10, 81, 300, 38);
		txtPalabra.setEditable(false);
		txtPalabra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPalabra.setForeground(Color.WHITE);
		txtPalabra.setBackground(Color.BLACK);
		txtPalabra.setColumns(10);

		btnPedirPista = new JButton("Pedir Pista");
		btnPedirPista.setBounds(203, 62, 153, 46);
		btnPedirPista.setFont(new Font("Tahoma", Font.PLAIN, 17));

		btnVolverAlMenu = new JButton("Volver al Menu");
		btnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolverAlMenu.setBounds(203, 8, 153, 46);
		btnVolverAlMenu.setFont(new Font("Tahoma", Font.PLAIN, 17));
		menu.setLayout(null);
		menu.add(btnResolver);
		menu.add(btnIniciar);
		menu.add(btnPedirPista);
		menu.add(btnVolverAlMenu);

		lblAhorcado = new JLabel("");
		lblAhorcado.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAhorcado.setVisible(false);
		GroupLayout gl_ahorcado = new GroupLayout(ahorcado);
		gl_ahorcado.setHorizontalGroup(gl_ahorcado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ahorcado.createSequentialGroup().addGap(37)
						.addComponent(lblAhorcado, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(44, Short.MAX_VALUE)));
		gl_ahorcado.setVerticalGroup(gl_ahorcado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ahorcado.createSequentialGroup().addGap(59)
						.addComponent(lblAhorcado, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(28, Short.MAX_VALUE)));
		ahorcado.setLayout(gl_ahorcado);

		JTextPane txtpnVidas = new JTextPane();
		txtpnVidas.setBounds(10, 11, 62, 27);
		txtpnVidas.setEditable(false);
		txtpnVidas.setText("Vidas:");
		txtpnVidas.setBackground(Color.GRAY);
		txtpnVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));

		numVidas = new JTextPane();
		numVidas.setBounds(73, 11, 18, 27);
		numVidas.setEditable(false);
		numVidas.setBackground(Color.GRAY);
		numVidas.setText("" + Main.options.getVid());
		numVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtpnPistas = new JTextPane();
		txtpnPistas.setBounds(109, 11, 62, 27);
		txtpnPistas.setText("Pistas:");
		txtpnPistas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPistas.setEditable(false);
		txtpnPistas.setBackground(Color.GRAY);

		btnPista = new JButton("");
		btnPista.setEnabled(false);
		btnPista.setForeground(Color.RED);
		btnPista.setBackground(Color.RED);
		btnPista.setBounds(181, 12, 33, 31);
		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		palabraSecreta.setLayout(null);

		fDifi = new JPanel();
		fDifi.setBorder(new LineBorder(Color.BLACK));
		fDifi.setBackground(Color.GRAY);
		fDifi.setBounds(0, 0, 381, 311);
		palabraSecreta.add(fDifi);
		fDifi.setLayout(null);

		JTextPane txtpnDificultad = new JTextPane();
		txtpnDificultad.setForeground(Color.WHITE);
		txtpnDificultad.setText("Dificultad:");
		txtpnDificultad.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtpnDificultad.setBackground(Color.GRAY);
		txtpnDificultad.setBounds(10, 37, 163, 43);
		fDifi.add(txtpnDificultad);

		rdbtnPri = new JRadioButton("Principiante");
		rdbtnPri.setSelected(true);
		rdbtnPri.setBackground(Color.GRAY);
		rdbtnPri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnPri.setBounds(20, 87, 253, 31);
		fDifi.add(rdbtnPri);

		rdbtnInt = new JRadioButton("Intermedio");
		rdbtnInt.setBackground(Color.GRAY);
		rdbtnInt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnInt.setBounds(20, 121, 253, 31);
		fDifi.add(rdbtnInt);

		rdbtnAv = new JRadioButton("Avanzado");
		rdbtnAv.setBackground(Color.GRAY);
		rdbtnAv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAv.setBounds(20, 155, 253, 31);
		fDifi.add(rdbtnAv);

		group = new ButtonGroup();
		group.add(rdbtnPri);
		group.add(rdbtnInt);
		group.add(rdbtnAv);

		btnOk = new JButton("ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOk.setBounds(113, 232, 152, 43);
		fDifi.add(btnOk);
		palabraSecreta.add(txtpnVidas);
		palabraSecreta.add(numVidas);
		palabraSecreta.add(txtpnPistas);
		palabraSecreta.add(btnPista);
		palabraSecreta.add(txtpnPalabraSecreta);
		palabraSecreta.add(txtPalabra);
		panel.setLayout(null);
		panel.add(menu);
		panel.add(palabraSecreta);

		JPanel letras = new JPanel();
		letras.setBounds(0, 136, 381, 175);
		palabraSecreta.add(letras);
		letras.setBorder(new LineBorder(Color.BLACK));
		letras.setBackground(Color.GRAY);

		btnA = new JButton("A");
		btnA.setBounds(11, 4, 50, 30);
		btnA.setBorder(new LineBorder(Color.DARK_GRAY));

		btnB = new JButton("B");
		btnB.setBounds(72, 4, 50, 30);
		btnB.setBorder(new LineBorder(Color.DARK_GRAY));

		btnC = new JButton("C");
		btnC.setBounds(133, 4, 50, 30);
		btnC.setBorder(new LineBorder(Color.DARK_GRAY));

		btnD = new JButton("D");
		btnD.setBounds(194, 4, 50, 30);
		btnD.setBorder(new LineBorder(Color.DARK_GRAY));

		btnE = new JButton("E");
		btnE.setBounds(255, 4, 50, 30);
		btnE.setBorder(new LineBorder(Color.DARK_GRAY));

		btnG = new JButton("G");
		btnG.setBounds(11, 38, 50, 30);
		btnG.setBorder(new LineBorder(Color.DARK_GRAY));

		btnH = new JButton("H");
		btnH.setBounds(72, 38, 50, 30);
		btnH.setBorder(new LineBorder(Color.DARK_GRAY));

		btnI = new JButton("I");
		btnI.setBounds(133, 38, 50, 30);
		btnI.setBorder(new LineBorder(Color.DARK_GRAY));

		btnJ = new JButton("J");
		btnJ.setBounds(194, 38, 50, 30);
		btnJ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnK = new JButton("K");
		btnK.setBounds(255, 38, 50, 30);
		btnK.setBorder(new LineBorder(Color.DARK_GRAY));

		btnM = new JButton("M");
		btnM.setBounds(11, 72, 50, 30);
		btnM.setBorder(new LineBorder(Color.DARK_GRAY));

		btnN = new JButton("N");
		btnN.setBounds(72, 72, 50, 30);
		btnN.setBorder(new LineBorder(Color.DARK_GRAY));

		btnÑ = new JButton("Ñ");
		btnÑ.setBounds(133, 72, 50, 30);
		btnÑ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnO = new JButton("O");
		btnO.setBounds(194, 72, 50, 30);
		btnO.setBorder(new LineBorder(Color.DARK_GRAY));

		btnP = new JButton("P");
		btnP.setBounds(255, 72, 50, 30);
		btnP.setBorder(new LineBorder(Color.DARK_GRAY));

		btnF = new JButton("F");
		btnF.setBounds(316, 4, 50, 30);
		btnF.setBorder(new LineBorder(Color.DARK_GRAY));

		btnW = new JButton("W");
		btnW.setBounds(72, 140, 50, 30);
		btnW.setBorder(new LineBorder(Color.DARK_GRAY));

		btnX = new JButton("X");
		btnX.setBounds(133, 140, 50, 30);
		btnX.setBorder(new LineBorder(Color.DARK_GRAY));

		btnY = new JButton("Y");
		btnY.setBounds(194, 140, 50, 30);
		btnY.setBorder(new LineBorder(Color.DARK_GRAY));

		btnZ = new JButton("Z");
		btnZ.setBounds(255, 140, 50, 30);
		btnZ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnR = new JButton("R");
		btnR.setBounds(21, 106, 50, 30);
		btnR.setBorder(new LineBorder(Color.DARK_GRAY));

		btnS = new JButton("S");
		btnS.setBounds(92, 106, 50, 30);
		btnS.setBorder(new LineBorder(Color.DARK_GRAY));

		btnT = new JButton("T");
		btnT.setBounds(163, 106, 50, 30);
		btnT.setBorder(new LineBorder(Color.DARK_GRAY));

		btnU = new JButton("U");
		btnU.setBounds(234, 106, 50, 30);
		btnU.setBorder(new LineBorder(Color.DARK_GRAY));

		btnV = new JButton("V");
		btnV.setBounds(305, 106, 50, 30);
		btnV.setBorder(new LineBorder(Color.DARK_GRAY));

		btnQ = new JButton("Q");
		btnQ.setBounds(316, 72, 50, 30);
		btnQ.setBorder(new LineBorder(Color.DARK_GRAY));

		btnL = new JButton("L");
		btnL.setBounds(316, 38, 50, 30);
		btnL.setBorder(new LineBorder(Color.DARK_GRAY));
		letras.setLayout(null);
		letras.add(btnA);
		letras.add(btnB);
		letras.add(btnC);
		letras.add(btnD);
		letras.add(btnE);
		letras.add(btnF);
		letras.add(btnG);
		letras.add(btnH);
		letras.add(btnI);
		letras.add(btnJ);
		letras.add(btnK);
		letras.add(btnL);
		letras.add(btnM);
		letras.add(btnN);
		letras.add(btnÑ);
		letras.add(btnO);
		letras.add(btnP);
		letras.add(btnQ);
		letras.add(btnR);
		letras.add(btnS);
		letras.add(btnT);
		letras.add(btnU);
		letras.add(btnV);
		letras.add(btnW);
		letras.add(btnX);
		letras.add(btnY);
		letras.add(btnZ);

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
		panel.add(ahorcado);

		// Acciones de los botones.

		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selecDificultad();
			}
		});

		btnResolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameOver();
			}
		});

		// Evento boton volver al menu.
		btnVolverAlMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.partida.setFrame(false);
					Main.window.setFrame(true);
				} catch (Exception epartida) {
					epartida.printStackTrace();
				}

			}
		});

		// Evento dificultad principiante.
		rdbtnPri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inte = 10;
				inte2 = inte;
			}
		});

		// Evento dificultad intermedia.
		rdbtnInt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inte = 8;
				inte2 = inte;
			}
		});

		// Evento dificultad avanzada.
		rdbtnAv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inte = 6;
				inte2 = inte;
			}
		});

		// Evento boton ok.
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fDifi.setVisible(false);
				iniciarSecreto(Main.list, true);
			}
		});

	}

	// Este metodo reinicia el interruptor de las letras para que dejen de estar
	// seleccionadas, se ha decidido hacerlo un metodo aparte por si fuera necesario
	// usarlo en mas de un sitio y para no alargar en exceso el listener de iniciar
	// partida.
	private void letrasOn() {
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

	// Este metodo apaga letras para que dejen de estar
	// seleccionadas, se ha decidido hacerlo un metodo aparte por si fuera necesario
	// usarlo en mas de un sitio y para no alargar en exceso el listener de iniciar
	// partida.
	private void letrasOff() {
		btnA.setEnabled(false);
		btnB.setEnabled(false);
		btnC.setEnabled(false);
		btnD.setEnabled(false);
		btnE.setEnabled(false);
		btnF.setEnabled(false);
		btnG.setEnabled(false);
		btnH.setEnabled(false);
		btnI.setEnabled(false);
		btnJ.setEnabled(false);
		btnK.setEnabled(false);
		btnL.setEnabled(false);
		btnM.setEnabled(false);
		btnN.setEnabled(false);
		btnÑ.setEnabled(false);
		btnO.setEnabled(false);
		btnP.setEnabled(false);
		btnQ.setEnabled(false);
		btnR.setEnabled(false);
		btnS.setEnabled(false);
		btnT.setEnabled(false);
		btnU.setEnabled(false);
		btnV.setEnabled(false);
		btnW.setEnabled(false);
		btnX.setEnabled(false);
		btnY.setEnabled(false);
		btnZ.setEnabled(false);
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
	private void comparaSecreto(char letra) {
		String texto = txtPalabra.getText(), vidTxt = "";
		char[] tChar = texto.toCharArray();
		boolean sale = false;

		for (int i = 0; i < this.secreto.length(); i++) {
			if (secreto.charAt(i) == letra) {
				tChar[i] = letra;
				sale = true;
			}
		}

		if (sale == false) {
			inte2--;
		}

		if (inte2 == 0) {
			inte2 = inte;
			vid--;
		}

		dibujarAhorcado();

		if (vid < 0) {
			gameOver();
		} else {
			vidTxt = Integer.toString(vid);
			texto = String.valueOf(tChar);
			txtPalabra.setText(texto);
			numVidas.setText(vidTxt);
		}
		if (!texto.contains("_")) {
			iniciarSecreto(Main.list, false);
			JOptionPane.showMessageDialog(null, "Felicidades, has adivinado la palabra,\nseleccionando otra palabra.");
		}
	}

	// Este metodo inicia partida, se ha decidido combertirlo en un metodo aparte
	// por que se usa en mas de un sitio.
	public void iniciarSecreto(ListaPalabras list, boolean vidas) {
		Random r = new Random();
		int r1 = r.nextInt((list.getListSize() - 0) + 1) + 0;
		letrasOn();
		setSecreto(secreto = list.getList(r1));

		if (vidas == true) {
			numVidas.setText("" + Main.options.getVid());
		}

		dibujarAhorcado();
		vid = Integer.parseInt(numVidas.getText());

		textoSecreto();
	}

	// Este metodo nos permite decidir en que dificultad queremos jugar.
	public void selecDificultad() {
		letrasOff();
		fDifi.setVisible(true);
	}

	// Este modulo se ejecuta cuando tenemos un game over (El jugador pierde todas
	// las vidas o se rinde.)
	private void gameOver() {
		JOptionPane.showMessageDialog(null,
				"Game Over\nLa palabra secreta era: " + this.secreto + "\nIniciando otra partida.");
		selecDificultad();
	}

	private void dibujarAhorcado() {
		if (inte2 < 10) {
			lblAhorcado.setVisible(true);
			lblAhorcado.setIcon(new ImageIcon(Partida.class.getResource("/img/" + inte2 + ".png")));
		} else {
			lblAhorcado.setVisible(false);
		}
	}

	// Getters y setters para la partida.
	public void setSecreto(String secreto) {
		this.secreto = secreto;
	}

	public String getSecreto() {
		return secreto;
	}

	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean frame) {
		this.frame.setVisible(frame);
	}
}
