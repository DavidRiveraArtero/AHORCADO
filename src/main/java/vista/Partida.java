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
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;

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
		palabraSecreta.setLayout(null);
		
		JTextPane txtpnPalabraSecreta = new JTextPane();
		txtpnPalabraSecreta.setEditable(false);
		txtpnPalabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPalabraSecreta.setText("Palabra secreta");
		txtpnPalabraSecreta.setBackground(Color.GRAY);
		txtpnPalabraSecreta.setBounds(10, 53, 99, 23);
		palabraSecreta.add(txtpnPalabraSecreta);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtT.setForeground(Color.WHITE);
		txtT.setBackground(Color.BLACK);
		txtT.setBounds(10, 81, 300, 38);
		palabraSecreta.add(txtT);
		txtT.setColumns(10);
		
		JPanel letras = new JPanel();
		letras.setBorder(new LineBorder(Color.BLACK));
		letras.setBackground(Color.GRAY);
		letras.setLayout(null);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(menu, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
						.addComponent(palabraSecreta, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
						.addComponent(letras, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(ahorcado, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(menu, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(palabraSecreta, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(letras, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
						.addComponent(ahorcado, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)))
		);
		
		JToggleButton tglbtnA = new JToggleButton("A");
		tglbtnA.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnA.setBounds(11, 3, 50, 30);
		letras.add(tglbtnA);
		
		JToggleButton tglbtnB = new JToggleButton("B");
		tglbtnB.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnB.setBounds(72, 3, 50, 30);
		letras.add(tglbtnB);
		
		JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnC.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnC.setBounds(133, 3, 50, 30);
		letras.add(tglbtnC);
		
		JToggleButton tglbtnD = new JToggleButton("D");
		tglbtnD.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnD.setBounds(194, 3, 50, 30);
		letras.add(tglbtnD);
		
		JToggleButton tglbtnE = new JToggleButton("E");
		tglbtnE.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnE.setBounds(255, 3, 50, 30);
		letras.add(tglbtnE);
		
		JToggleButton tglbtnG = new JToggleButton("G");
		tglbtnG.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnG.setBounds(11, 36, 50, 30);
		letras.add(tglbtnG);
		
		JToggleButton tglbtnH = new JToggleButton("H");
		tglbtnH.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnH.setBounds(72, 36, 50, 30);
		letras.add(tglbtnH);
		
		JToggleButton tglbtnI = new JToggleButton("I");
		tglbtnI.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnI.setBounds(133, 36, 50, 30);
		letras.add(tglbtnI);
		
		JToggleButton tglbtnJ = new JToggleButton("J");
		tglbtnJ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnJ.setBounds(194, 36, 50, 30);
		letras.add(tglbtnJ);
		
		JToggleButton tglbtnK = new JToggleButton("K");
		tglbtnK.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnK.setBounds(255, 36, 50, 30);
		letras.add(tglbtnK);
		
		JToggleButton tglbtnM = new JToggleButton("M");
		tglbtnM.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnM.setBounds(11, 69, 50, 30);
		letras.add(tglbtnM);
		
		JToggleButton tglbtnN = new JToggleButton("N");
		tglbtnN.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnN.setBounds(72, 69, 50, 30);
		letras.add(tglbtnN);
		
		JToggleButton tglbtnÑ = new JToggleButton("Ñ");
		tglbtnÑ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnÑ.setBounds(133, 69, 50, 30);
		letras.add(tglbtnÑ);
		
		JToggleButton tglbtnO = new JToggleButton("O");
		tglbtnO.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnO.setBounds(194, 69, 50, 30);
		letras.add(tglbtnO);
		
		JToggleButton tglbtnP = new JToggleButton("P");
		tglbtnP.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnP.setBounds(255, 69, 50, 30);
		letras.add(tglbtnP);
		
		JToggleButton tglbtnF = new JToggleButton("F");
		tglbtnF.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnF.setBounds(316, 3, 50, 30);
		letras.add(tglbtnF);
		
		JToggleButton tglbtnW = new JToggleButton("W");
		tglbtnW.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnW.setBounds(72, 135, 50, 30);
		letras.add(tglbtnW);
		
		JToggleButton tglbtnX = new JToggleButton("X");
		tglbtnX.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnX.setBounds(133, 135, 50, 30);
		letras.add(tglbtnX);
		
		JToggleButton tglbtnY = new JToggleButton("Y");
		tglbtnY.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnY.setBounds(194, 135, 50, 30);
		letras.add(tglbtnY);
		
		JToggleButton tglbtnZ = new JToggleButton("Z");
		tglbtnZ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnZ.setBounds(255, 135, 50, 30);
		letras.add(tglbtnZ);
		
		JToggleButton tglbtnR = new JToggleButton("R");
		tglbtnR.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnR.setBounds(21, 102, 50, 30);
		letras.add(tglbtnR);
		
		JToggleButton tglbtnS = new JToggleButton("S");
		tglbtnS.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnS.setBounds(92, 102, 50, 30);
		letras.add(tglbtnS);
		
		JToggleButton tglbtnT = new JToggleButton("T");
		tglbtnT.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnT.setBounds(163, 102, 50, 30);
		letras.add(tglbtnT);
		
		JToggleButton tglbtnU = new JToggleButton("U");
		tglbtnU.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnU.setBounds(234, 102, 50, 30);
		letras.add(tglbtnU);
		
		JToggleButton tglbtnV = new JToggleButton("V");
		tglbtnV.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnV.setBounds(305, 102, 50, 30);
		letras.add(tglbtnV);
		
		JToggleButton tglbtnQ = new JToggleButton("Q");
		tglbtnQ.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnQ.setBounds(316, 69, 50, 30);
		letras.add(tglbtnQ);
		
		JToggleButton tglbtnL = new JToggleButton("L");
		tglbtnL.setBorder(new LineBorder(Color.DARK_GRAY));
		tglbtnL.setBounds(316, 36, 50, 30);
		letras.add(tglbtnL);
		panel.setLayout(gl_panel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
