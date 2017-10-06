package ArbolBinario;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPantalla;
	/**
	 * @wbp.nonvisual location=455,174
	 */
	private final JDesktopPane desktopPane = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtPantalla.setText(txtPantalla.getText()+ "Quelopario");
			}
		});
		btnNewButton.setBounds(259, 202, 117, 25);
		contentPane.add(btnNewButton);
		
		txtPantalla = new JTextField();
		txtPantalla.setText("");
		txtPantalla.setBounds(53, 34, 248, 19);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(319, 36, 70, 15);
		contentPane.add(lblTexto);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		btnNewButton_1.setBounds(30, 202, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnBorrar.setBounds(53, 77, 117, 25);
		contentPane.add(btnBorrar);
	}
}
