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
import javax.swing.JToggleButton;

public class Partida {

	private JFrame frame;
	private JTextField txtPalabra;
	private String secreto;
	JToggleButton tglbtnA;
	JToggleButton tglbtnB;
	JToggleButton tglbtnC;
	JToggleButton tglbtnD;
	JToggleButton tglbtnE;
	JToggleButton tglbtnF;
	JToggleButton tglbtnG;
	JToggleButton tglbtnH;
	JToggleButton tglbtnI;
	JToggleButton tglbtnJ;
	JToggleButton tglbtnK;
	JToggleButton tglbtnL;
	JToggleButton tglbtnM;
	JToggleButton tglbtnN;
	JToggleButton tglbtnÑ;
	JToggleButton tglbtnO;
	JToggleButton tglbtnP;
	JToggleButton tglbtnQ;
	JToggleButton tglbtnR;
	JToggleButton tglbtnS;
	JToggleButton tglbtnT;
	JToggleButton tglbtnU;
	JToggleButton tglbtnV;
	JToggleButton tglbtnW;
	JToggleButton tglbtnX;
	JToggleButton tglbtnY;
	JToggleButton tglbtnZ;
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
		iniciarSecreto(list);

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
		txtpnIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnIntentos.setText("Intentos:");
		txtpnIntentos.setBackground(Color.GRAY);
		txtpnIntentos.setBounds(10, 11, 88, 31);
		ahorcado.add(txtpnIntentos);

		numIntentos = new JTextPane();
		numIntentos.setBackground(Color.GRAY);
		numIntentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numIntentos.setText("10");
		numIntentos.setBounds(100, 11, 29, 31);
		ahorcado.add(numIntentos);

		JTextPane txtpnVidas = new JTextPane();
		txtpnVidas.setText("Vidas:");
		txtpnVidas.setBackground(Color.GRAY);
		txtpnVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnVidas.setBounds(10, 11, 62, 27);
		palabraSecreta.add(txtpnVidas);

		numVidas = new JTextPane();
		numVidas.setBackground(Color.GRAY);
		numVidas.setText("5");
		numVidas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numVidas.setBounds(73, 11, 18, 27);
		palabraSecreta.add(numVidas);

		tglbtnA = new JToggleButton("A");
		tglbtnA.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnA.setBounds(11, 3, 50, 30);
		letras.add(tglbtnA);

		tglbtnB = new JToggleButton("B");
		tglbtnB.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnB.setBounds(72, 3, 50, 30);
		letras.add(tglbtnB);

		tglbtnC = new JToggleButton("C");
		tglbtnC.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnC.setBounds(133, 3, 50, 30);
		letras.add(tglbtnC);

		tglbtnD = new JToggleButton("D");
		tglbtnD.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnD.setBounds(194, 3, 50, 30);
		letras.add(tglbtnD);

		tglbtnE = new JToggleButton("E");
		tglbtnE.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnE.setBounds(255, 3, 50, 30);
		letras.add(tglbtnE);

		tglbtnG = new JToggleButton("G");
		tglbtnG.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnG.setBounds(11, 36, 50, 30);
		letras.add(tglbtnG);

		tglbtnH = new JToggleButton("H");
		tglbtnH.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnH.setBounds(72, 36, 50, 30);
		letras.add(tglbtnH);

		tglbtnI = new JToggleButton("I");
		tglbtnI.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnI.setBounds(133, 36, 50, 30);
		letras.add(tglbtnI);

		tglbtnJ = new JToggleButton("J");
		tglbtnJ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnJ.setBounds(194, 36, 50, 30);
		letras.add(tglbtnJ);

		tglbtnK = new JToggleButton("K");
		tglbtnK.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnK.setBounds(255, 36, 50, 30);
		letras.add(tglbtnK);

		tglbtnM = new JToggleButton("M");
		tglbtnM.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnM.setBounds(11, 69, 50, 30);
		letras.add(tglbtnM);

		tglbtnN = new JToggleButton("N");
		tglbtnN.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnN.setBounds(72, 69, 50, 30);
		letras.add(tglbtnN);

		tglbtnÑ = new JToggleButton("Ñ");
		tglbtnÑ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnÑ.setBounds(133, 69, 50, 30);
		letras.add(tglbtnÑ);

		tglbtnO = new JToggleButton("O");
		tglbtnO.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnO.setBounds(194, 69, 50, 30);
		letras.add(tglbtnO);

		tglbtnP = new JToggleButton("P");
		tglbtnP.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnP.setBounds(255, 69, 50, 30);
		letras.add(tglbtnP);

		tglbtnF = new JToggleButton("F");
		tglbtnF.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnF.setBounds(316, 3, 50, 30);
		letras.add(tglbtnF);

		tglbtnW = new JToggleButton("W");
		tglbtnW.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnW.setBounds(72, 135, 50, 30);
		letras.add(tglbtnW);

		tglbtnX = new JToggleButton("X");
		tglbtnX.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnX.setBounds(133, 135, 50, 30);
		letras.add(tglbtnX);

		tglbtnY = new JToggleButton("Y");
		tglbtnY.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnY.setBounds(194, 135, 50, 30);
		letras.add(tglbtnY);

		tglbtnZ = new JToggleButton("Z");
		tglbtnZ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnZ.setBounds(255, 135, 50, 30);
		letras.add(tglbtnZ);

		tglbtnR = new JToggleButton("R");
		tglbtnR.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnR.setBounds(21, 102, 50, 30);
		letras.add(tglbtnR);

		tglbtnS = new JToggleButton("S");
		tglbtnS.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnS.setBounds(92, 102, 50, 30);
		letras.add(tglbtnS);

		tglbtnT = new JToggleButton("T");
		tglbtnT.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnT.setBounds(163, 102, 50, 30);
		letras.add(tglbtnT);

		tglbtnU = new JToggleButton("U");
		tglbtnU.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnU.setBounds(234, 102, 50, 30);
		letras.add(tglbtnU);

		tglbtnV = new JToggleButton("V");
		tglbtnV.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnV.setBounds(305, 102, 50, 30);
		letras.add(tglbtnV);

		tglbtnQ = new JToggleButton("Q");
		tglbtnQ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnQ.setBounds(316, 69, 50, 30);
		letras.add(tglbtnQ);

		tglbtnL = new JToggleButton("L");
		tglbtnL.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnL.setBounds(316, 36, 50, 30);
		letras.add(tglbtnL);
		panel.setLayout(gl_panel);

		// Acciones de los botones.

		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				iniciarSecreto(list);
			}
		});

		btnResolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(getSecreto());

			}
		});

		tglbtnA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('A');
			}
		});

		tglbtnB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('B');
			}
		});

		tglbtnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('C');
			}
		});

		tglbtnD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('D');
			}
		});

		tglbtnE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('E');
			}
		});

		tglbtnF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('F');
			}
		});

		tglbtnG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('G');
			}
		});

		tglbtnH.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('H');
			}
		});

		tglbtnI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('I');
			}
		});

		tglbtnJ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('J');
			}
		});

		tglbtnK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('K');
			}
		});

		tglbtnL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('L');
			}
		});

		tglbtnM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('M');
			}
		});

		tglbtnN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('N');
			}
		});

		tglbtnÑ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('Ñ');
			}
		});

		tglbtnO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('O');
			}
		});

		tglbtnP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('P');
			}
		});

		tglbtnQ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('Q');
			}
		});

		tglbtnR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('R');
			}
		});

		tglbtnS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('S');
			}
		});

		tglbtnT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('T');
			}
		});

		tglbtnU.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('U');
			}
		});

		tglbtnV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('V');
			}
		});

		tglbtnW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('W');
			}
		});

		tglbtnX.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('X');
			}
		});

		tglbtnY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('Y');
			}
		});

		tglbtnZ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comparaSecreto('Z');
			}
		});

	}

	// Este metodo reinicia el interruptor de las letras para que dejen de estar
	// seleccionadas, se ha decidido hacerlo un metodo aparte por si fuera necesario
	// usarlo en mas de un sitio y para no alargar en exceso el listener de iniciar
	// partida.
	private void letras() {
		tglbtnA.setSelected(false);
		tglbtnB.setSelected(false);
		tglbtnC.setSelected(false);
		tglbtnD.setSelected(false);
		tglbtnE.setSelected(false);
		tglbtnF.setSelected(false);
		tglbtnG.setSelected(false);
		tglbtnH.setSelected(false);
		tglbtnI.setSelected(false);
		tglbtnJ.setSelected(false);
		tglbtnK.setSelected(false);
		tglbtnL.setSelected(false);
		tglbtnM.setSelected(false);
		tglbtnN.setSelected(false);
		tglbtnÑ.setSelected(false);
		tglbtnO.setSelected(false);
		tglbtnP.setSelected(false);
		tglbtnQ.setSelected(false);
		tglbtnR.setSelected(false);
		tglbtnS.setSelected(false);
		tglbtnT.setSelected(false);
		tglbtnU.setSelected(false);
		tglbtnV.setSelected(false);
		tglbtnW.setSelected(false);
		tglbtnX.setSelected(false);
		tglbtnY.setSelected(false);
		tglbtnZ.setSelected(false);
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
		String texto = txtPalabra.getText(), inteTxt="", vidTxt="";
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
			inte --;
		}
		
		if (inte == 0) {
			inte = 10;
			vid --;
		}
		
		if (vid > 0) {
			JOptionPane.showMessageDialog(null, "Game Over\nIniciando otra partida.");
			iniciarSecreto(list);
		}
		
		inteTxt=Integer.toString(inte);
		vidTxt=Integer.toString(vid);
		texto = String.valueOf(tChar);
		txtPalabra.setText(texto);
		numIntentos.setText(inteTxt);
		numVidas.setText(vidTxt);
		
	}

	// Este metodo inicia partida, se ha decidido combertirlo en un metodo aparte
	// por que se usa en mas de un sitio.
	private void iniciarSecreto(ListaPalabras list) {
		Random r = new Random();
		int r1 = r.nextInt((list.getListSize() - 0) + 1) + 0;
		setSecreto(secreto = list.getList(r1));
		letras();
		numVidas.setText("5");
		numIntentos.setText("10");
		textoSecreto();
	}

	// Getters y setters para la partida.
	public void setSecreto(String secreto) {
		this.secreto = secreto;
	}

	public String getSecreto() {
		return secreto;
	}
}
