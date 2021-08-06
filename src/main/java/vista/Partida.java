package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
import javax.swing.JButton;

public class Partida {

	private JFrame frame;
	private JTextField txtPalabra;
	private String secreto;
	JButton btnA;
	JButton btnB;
	JButton btnC;
	JButton btnD;
	JButton btnE;
	JButton btnF;
	JButton btnG;
	JButton btnH;
	JButton btnI;
	JButton btnJ;
	JButton btnK;
	JButton btnL;
	JButton btnM;
	JButton btnN;
	JButton btnÑ;
	JButton btnO;
	JButton btnP;
	JButton btnQ;
	JButton btnR;
	JButton btnS;
	JButton btnT;
	JButton btnU;
	JButton btnV;
	JButton btnW;
	JButton btnX;
	JButton btnY;
	JButton btnZ;
	JTextPane numIntentos;
	JTextPane numVidas;
	ListaPalabras list = new ListaPalabras();

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
		iniciarSecreto(list, true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
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
		ahorcado.setLayout(null);

		JPanel menu = new JPanel();
		menu.setBackground(Color.GRAY);
		menu.setBorder(new LineBorder(Color.BLACK));
		menu.setLayout(null);

		JButton btnIniciar = new JButton("Iniciar Juego");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnIniciar.setBounds(33, 8, 300, 46);
		menu.add(btnIniciar);

		JButton btnResolver = new JButton("Resolver Juego");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnResolver.setBounds(33, 62, 300, 46);
		menu.add(btnResolver);

		JPanel palabraSecreta = new JPanel();
		palabraSecreta.setBorder(new LineBorder(Color.BLACK));
		palabraSecreta.setBackground(Color.GRAY);
		palabraSecreta.setLayout(null);

		JTextPane txtpnPalabraSecreta = new JTextPane();
		txtpnPalabraSecreta.setEditable(false);
		txtpnPalabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPalabraSecreta.setText("Palabra secreta");
		txtpnPalabraSecreta.setBackground(Color.GRAY);
		txtpnPalabraSecreta.setBounds(10, 49, 158, 31);
		palabraSecreta.add(txtpnPalabraSecreta);

		txtPalabra = new JTextField();
		txtPalabra.setEditable(false);
		txtPalabra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPalabra.setForeground(Color.WHITE);
		txtPalabra.setBackground(Color.BLACK);
		txtPalabra.setBounds(10, 81, 300, 38);
		palabraSecreta.add(txtPalabra);
		txtPalabra.setColumns(10);

		JPanel letras = new JPanel();
		letras.setBorder(new LineBorder(Color.BLACK));
		letras.setBackground(Color.GRAY);
		letras.setLayout(null);
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

		JTextPane txtpnIntentos = new JTextPane();
		txtpnIntentos.setEditable(false);
		txtpnIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnIntentos.setText("Intentos:");
		txtpnIntentos.setBackground(Color.GRAY);
		txtpnIntentos.setBounds(10, 11, 88, 31);
		ahorcado.add(txtpnIntentos);

		numIntentos = new JTextPane();
		numIntentos.setEditable(false);
		numIntentos.setBackground(Color.GRAY);
		numIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numIntentos.setText("10");
		numIntentos.setBounds(100, 11, 29, 31);
		ahorcado.add(numIntentos);

		JTextPane txtpnVidas = new JTextPane();
		txtpnVidas.setEditable(false);
		txtpnVidas.setText("Vidas:");
		txtpnVidas.setBackground(Color.GRAY);
		txtpnVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnVidas.setBounds(10, 11, 62, 27);
		palabraSecreta.add(txtpnVidas);

		numVidas = new JTextPane();
		numVidas.setEditable(false);
		numVidas.setBackground(Color.GRAY);
		numVidas.setText("5");
		numVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numVidas.setBounds(73, 11, 18, 27);
		palabraSecreta.add(numVidas);

		btnA = new JButton("A");
		btnA.setBorder(new LineBorder(Color.DARK_GRAY));
		btnA.setBounds(11, 3, 50, 30);
		letras.add(btnA);

		btnB = new JButton("B");
		btnB.setBorder(new LineBorder(Color.DARK_GRAY));
		btnB.setBounds(72, 3, 50, 30);
		letras.add(btnB);

		btnC = new JButton("C");
		btnC.setBorder(new LineBorder(Color.DARK_GRAY));
		btnC.setBounds(133, 3, 50, 30);
		letras.add(btnC);

		btnD = new JButton("D");
		btnD.setBorder(new LineBorder(Color.DARK_GRAY));
		btnD.setBounds(194, 3, 50, 30);
		letras.add(btnD);

		btnE = new JButton("E");
		btnE.setBorder(new LineBorder(Color.DARK_GRAY));
		btnE.setBounds(255, 3, 50, 30);
		letras.add(btnE);

		btnG = new JButton("G");
		btnG.setBorder(new LineBorder(Color.DARK_GRAY));
		btnG.setBounds(11, 36, 50, 30);
		letras.add(btnG);

		btnH = new JButton("H");
		btnH.setBorder(new LineBorder(Color.DARK_GRAY));
		btnH.setBounds(72, 36, 50, 30);
		letras.add(btnH);

		btnI = new JButton("I");
		btnI.setBorder(new LineBorder(Color.DARK_GRAY));
		btnI.setBounds(133, 36, 50, 30);
		letras.add(btnI);

		btnJ = new JButton("J");
		btnJ.setBorder(new LineBorder(Color.DARK_GRAY));
		btnJ.setBounds(194, 36, 50, 30);
		letras.add(btnJ);

		btnK = new JButton("K");
		btnK.setBorder(new LineBorder(Color.DARK_GRAY));
		btnK.setBounds(255, 36, 50, 30);
		letras.add(btnK);

		btnM = new JButton("M");
		btnM.setBorder(new LineBorder(Color.DARK_GRAY));
		btnM.setBounds(11, 69, 50, 30);
		letras.add(btnM);

		btnN = new JButton("N");
		btnN.setBorder(new LineBorder(Color.DARK_GRAY));
		btnN.setBounds(72, 69, 50, 30);
		letras.add(btnN);

		btnÑ = new JButton("Ñ");
		btnÑ.setBorder(new LineBorder(Color.DARK_GRAY));
		btnÑ.setBounds(133, 69, 50, 30);
		letras.add(btnÑ);

		btnO = new JButton("O");
		btnO.setBorder(new LineBorder(Color.DARK_GRAY));
		btnO.setBounds(194, 69, 50, 30);
		letras.add(btnO);

		btnP = new JButton("P");
		btnP.setBorder(new LineBorder(Color.DARK_GRAY));
		btnP.setBounds(255, 69, 50, 30);
		letras.add(btnP);

		btnF = new JButton("F");
		btnF.setBorder(new LineBorder(Color.DARK_GRAY));
		btnF.setBounds(316, 3, 50, 30);
		letras.add(btnF);

		btnW = new JButton("W");
		btnW.setBorder(new LineBorder(Color.DARK_GRAY));
		btnW.setBounds(72, 135, 50, 30);
		letras.add(btnW);

		btnX = new JButton("X");
		btnX.setBorder(new LineBorder(Color.DARK_GRAY));
		btnX.setBounds(133, 135, 50, 30);
		letras.add(btnX);

		btnY = new JButton("Y");
		btnY.setBorder(new LineBorder(Color.DARK_GRAY));
		btnY.setBounds(194, 135, 50, 30);
		letras.add(btnY);

		btnZ = new JButton("Z");
		btnZ.setBorder(new LineBorder(Color.DARK_GRAY));
		btnZ.setBounds(255, 135, 50, 30);
		letras.add(btnZ);

		btnR = new JButton("R");
		btnR.setBorder(new LineBorder(Color.DARK_GRAY));
		btnR.setBounds(21, 102, 50, 30);
		letras.add(btnR);

		btnS = new JButton("S");
		btnS.setBorder(new LineBorder(Color.DARK_GRAY));
		btnS.setBounds(92, 102, 50, 30);
		letras.add(btnS);

		btnT = new JButton("T");
		btnT.setBorder(new LineBorder(Color.DARK_GRAY));
		btnT.setBounds(163, 102, 50, 30);
		letras.add(btnT);

		btnU = new JButton("U");
		btnU.setBorder(new LineBorder(Color.DARK_GRAY));
		btnU.setBounds(234, 102, 50, 30);
		letras.add(btnU);

		btnV = new JButton("V");
		btnV.setBorder(new LineBorder(Color.DARK_GRAY));
		btnV.setBounds(305, 102, 50, 30);
		letras.add(btnV);

		btnQ = new JButton("Q");
		btnQ.setBorder(new LineBorder(Color.DARK_GRAY));
		btnQ.setBounds(316, 69, 50, 30);
		letras.add(btnQ);

		btnL = new JButton("L");
		btnL.setBorder(new LineBorder(Color.DARK_GRAY));
		btnL.setBounds(316, 36, 50, 30);
		letras.add(btnL);
		panel.setLayout(gl_panel);

		// Acciones de los botones.

		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarSecreto(list, true);
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
		String texto1 = "", texto2 = " ";

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
		if (!texto.contains(" ")) {
			iniciarSecreto(list, false);
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
		iniciarSecreto(list, true);
	}

	// Getters y setters para la partida.
	public void setSecreto(String secreto) {
		this.secreto = secreto;
	}

	public String getSecreto() {
		return secreto;
	}
}
