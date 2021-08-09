package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import code.ListaPalabras;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;

public class Main {

	public JFrame frame;
	static Main window = null;
	static Partida partida = null;
	static Options options = null;
	public static ListaPalabras list = new ListaPalabras();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Main();
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
	public Main() {
		initialize();
		options = new Options();
		partida = new Partida();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(panel,
				GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE));
		panel.setLayout(null);
		
		JTextPane txtpnPor = new JTextPane();
		txtpnPor.setText("Por:\n     David R.\n     Dídac M.");
		txtpnPor.setOpaque(false);
		txtpnPor.setForeground(Color.WHITE);
		txtpnPor.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtpnPor.setBounds(429, 65, 192, 161);
		panel.add(txtpnPor);
		
		JTextPane txtpnElAhorcado = new JTextPane();
		txtpnElAhorcado.setForeground(Color.WHITE);
//		txtpnElAhorcado.setBackground(new Color(255, 255, 255));
		txtpnElAhorcado.setOpaque(false);
		txtpnElAhorcado.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtpnElAhorcado.setText("El Ahorcado");
		txtpnElAhorcado.setBounds(429, 11, 246, 55);
		panel.add(txtpnElAhorcado);

		JButton btnIniciarPartida = new JButton("Iniciar Partida");
		btnIniciarPartida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarPartida.setBounds(472, 343, 203, 48);
		panel.add(btnIniciarPartida);

		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOpciones.setBounds(472, 402, 203, 48);
		panel.add(btnOpciones);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/soga.jpg")));
		lblNewLabel.setBounds(0, 0, 694, 472);
		panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Evento boton iniciar partida.
		btnIniciarPartida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					partida.iniciarSecreto(list, true);
					window.setFrame(false);
					partida.setFrame(true);
				} catch (Exception epartida) {
					epartida.printStackTrace();
				}

			}
		});

		// Evento boton opciones.
		btnOpciones.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					window.setFrame(false);
					options.setFrame(true);
				} catch (Exception epartida) {
					epartida.printStackTrace();
				}

			}
		});

	}

	// Getters y setters.
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean frame) {
		this.frame.setVisible(frame);
	}
}
