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

public class Options {

	public JFrame frame;
	private JTextField textVidas;
	private JPanel listaPalabras;

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

		JPanel vidas = new JPanel();
		vidas.setBorder(new LineBorder(Color.BLACK));
		vidas.setBackground(Color.GRAY);

		listaPalabras = new JPanel();
		listaPalabras.setBorder(new LineBorder(Color.BLACK));
		listaPalabras.setBackground(Color.GRAY);

		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(listaPalabras, GroupLayout.PREFERRED_SIZE, 334,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
								.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
						.addComponent(vidas, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(vidas, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(listaPalabras,
												GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(15, Short.MAX_VALUE)));

		JTextPane txtpnListaDePalabras = new JTextPane();
		txtpnListaDePalabras.setText("Lista de palabras:");
		txtpnListaDePalabras.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnListaDePalabras.setEditable(false);
		txtpnListaDePalabras.setBackground(Color.GRAY);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList<String> list = new JList<String>(listModel);
		list.setBorder(new LineBorder(Color.DARK_GRAY));
		list.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_listaPalabras = new GroupLayout(listaPalabras);

		for (int i = 0; i < Main.list.getListSize(); i++) {
			listModel.addElement(Main.list.getList(i));
		}
		;

		gl_listaPalabras.setHorizontalGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listaPalabras.createSequentialGroup().addContainerGap()
						.addGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnListaDePalabras, GroupLayout.PREFERRED_SIZE, 197,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(92, Short.MAX_VALUE)));
		gl_listaPalabras.setVerticalGroup(gl_listaPalabras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_listaPalabras.createSequentialGroup().addContainerGap()
						.addComponent(txtpnListaDePalabras, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE).addGap(23)));
		listaPalabras.setLayout(gl_listaPalabras);

		textVidas = new JTextField();
		textVidas.setBackground(Color.LIGHT_GRAY);
		textVidas.setText("5");
		textVidas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textVidas.setColumns(10);

		JTextPane txtpnNVidas = new JTextPane();
		txtpnNVidas.setEditable(false);
		txtpnNVidas.setBackground(Color.GRAY);
		txtpnNVidas.setText("Nº Vidas:");
		txtpnNVidas.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_vidas = new GroupLayout(vidas);
		gl_vidas.setHorizontalGroup(gl_vidas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_vidas.createSequentialGroup().addContainerGap()
						.addComponent(txtpnNVidas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textVidas, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(146, Short.MAX_VALUE)));
		gl_vidas.setVerticalGroup(gl_vidas.createParallelGroup(Alignment.LEADING).addGroup(gl_vidas
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_vidas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_vidas.createSequentialGroup().addGap(3).addComponent(textVidas,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtpnNVidas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(18, Short.MAX_VALUE)));
		vidas.setLayout(gl_vidas);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Evento boton opciones.
		btnMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.window.setFrame(true);
					Main.options.setFrame(false);;
				} catch (Exception epartida) {
					epartida.printStackTrace();
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
}
