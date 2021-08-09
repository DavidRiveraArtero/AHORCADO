package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Options {

	public JFrame frame;
	private JTextField textPalabra;
	private JPanel listaPalabras;
	private int vid = 5;
	private JTextField textVidas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options window = new Options();
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
	public Options() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		JPanel añadirPalabra = new JPanel();
		añadirPalabra.setBounds(13, 11, 322, 59);
		añadirPalabra.setBorder(new LineBorder(Color.BLACK));
		añadirPalabra.setBackground(Color.GRAY);

		listaPalabras = new JPanel();
		listaPalabras.setBounds(13, 83, 322, 365);
		listaPalabras.setBorder(new LineBorder(Color.BLACK));
		listaPalabras.setBackground(Color.GRAY);

		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.setBounds(471, 398, 203, 48);
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JPanel vidas = new JPanel();
		vidas.setBounds(348, 11, 322, 59);
		vidas.setBorder(new LineBorder(Color.BLACK));
		vidas.setBackground(Color.GRAY);

		JTextPane txtpnNVidas_1 = new JTextPane();
		txtpnNVidas_1.setText("Nº Vidas:");
		txtpnNVidas_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnNVidas_1.setEditable(false);
		txtpnNVidas_1.setBackground(Color.GRAY);

		textVidas = new JTextField();
		textVidas.setText("5");
		textVidas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textVidas.setColumns(10);
		textVidas.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_vidas = new GroupLayout(vidas);
		gl_vidas.setHorizontalGroup(gl_vidas.createParallelGroup(Alignment.TRAILING).addGap(0, 322, Short.MAX_VALUE)
				.addGroup(gl_vidas.createSequentialGroup().addContainerGap()
						.addComponent(txtpnNVidas_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textVidas, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(146, Short.MAX_VALUE)));
		gl_vidas.setVerticalGroup(gl_vidas.createParallelGroup(Alignment.LEADING).addGap(0, 59, Short.MAX_VALUE)
				.addGroup(gl_vidas.createSequentialGroup().addContainerGap().addGroup(gl_vidas
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_vidas.createSequentialGroup().addGap(3).addComponent(textVidas,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtpnNVidas_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addContainerGap(65, Short.MAX_VALUE)));
		vidas.setLayout(gl_vidas);

		JTextPane txtpnListaDePalabras = new JTextPane();
		txtpnListaDePalabras.setText("Lista de palabras:");
		txtpnListaDePalabras.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnListaDePalabras.setEditable(false);
		txtpnListaDePalabras.setBackground(Color.GRAY);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList<String> list = new JList<String>(listModel);
		list.setBackground(Color.GRAY);
		GroupLayout gl_listaPalabras = new GroupLayout(listaPalabras);
		gl_listaPalabras.setHorizontalGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listaPalabras.createSequentialGroup().addContainerGap()
						.addGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnListaDePalabras, GroupLayout.PREFERRED_SIZE, 197,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));
		gl_listaPalabras.setVerticalGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listaPalabras.createSequentialGroup().addContainerGap()
						.addComponent(txtpnListaDePalabras, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE).addGap(23)));

		for (int i = 0; i < Main.list.getListSize(); i++) {
			listModel.addElement(Main.list.getList(i));
		}
		;
		listaPalabras.setLayout(gl_listaPalabras);

		textPalabra = new JTextField();
		textPalabra.setBounds(15, 18, 115, 23);
		textPalabra.setBackground(Color.LIGHT_GRAY);
		textPalabra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPalabra.setColumns(10);

		JButton btnAdd = new JButton("Añadir Palabra");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(140, 11, 165, 37);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(vidas);
		frame.getContentPane().add(listaPalabras);
		frame.getContentPane().add(btnMenu);
		frame.getContentPane().add(añadirPalabra);
		añadirPalabra.setLayout(null);
		añadirPalabra.add(textPalabra);
		añadirPalabra.add(btnAdd);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Evento boton volver al menu.
		btnMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					vid = Integer.parseInt(textVidas.getText());
				} catch (NumberFormatException evid) {
					JOptionPane.showMessageDialog(null,
							"Tienes que introducir un numero, manteniendo vidas por defecto.");
				}

				try {
					Main.window.setFrame(true);
					Main.options.setFrame(false);
					;
				} catch (Exception emenu) {
					emenu.printStackTrace();
				}
			}
		});

	}

	// Getters y setters
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean frame) {
		this.frame.setVisible(frame);
	}

	public int getVid() {
		return vid;
	}
}
