package vista;

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

public class Menu {

	private JFrame frame;
	private Partida partida = null;
	private Options options = null;
	public static ListaPalabras list = new ListaPalabras();
	public JButton btnIniciarPartida, btnOpciones;
	private GroupLayout groupLayout;
	private JTextPane txtpnPor, txtpnElAhorcado;
	private JLabel lblNewLabel;
	private JPanel panel;

	/**
	 * Create the application. 
	 */
	public Menu() {
		options = new Options();
		partida = new Partida(options);
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(panel,
				GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE));
		panel.setLayout(null);

		txtpnPor = new JTextPane();
		txtpnPor.setText("Por:\n     David R.\n     Dídac M.");
		txtpnPor.setOpaque(false);
		txtpnPor.setForeground(Color.WHITE);
		txtpnPor.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtpnPor.setBounds(429, 65, 192, 161);
		panel.add(txtpnPor);

		txtpnElAhorcado = new JTextPane();
		txtpnElAhorcado.setForeground(Color.WHITE);
		txtpnElAhorcado.setOpaque(false);
		txtpnElAhorcado.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtpnElAhorcado.setText("El Ahorcado");
		txtpnElAhorcado.setBounds(429, 11, 246, 55);
		panel.add(txtpnElAhorcado);

		btnIniciarPartida = new JButton("Iniciar Partida");
		btnIniciarPartida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarPartida.setBounds(472, 343, 203, 48);
		panel.add(btnIniciarPartida);

		btnOpciones = new JButton("Opciones");
		btnOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOpciones.setBounds(472, 402, 203, 48);
		panel.add(btnOpciones);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/soga.jpg")));
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
					frame.setVisible(false);
					partida.setFrame(true);
					partida.selecDificultad();
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
					frame.setVisible(false);
					options.setFrame(true);
				} catch (Exception eopciones) {
					eopciones.printStackTrace();
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
