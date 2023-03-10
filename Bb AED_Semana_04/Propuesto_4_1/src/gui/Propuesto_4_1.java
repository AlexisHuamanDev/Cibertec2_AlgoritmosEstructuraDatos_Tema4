package gui;

import lib.Libreria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Propuesto_4_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JLabel lblNombres;
	private JTextField txtApellidoPaterno;
	private JTextField txtApellidoMaterno;
	private JTextField txtNombres;
	private JButton btnProcesar;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_4_1 frame = new Propuesto_4_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_4_1() {
		setTitle("Propuesto_4_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(10, 10, 100, 23);
		contentPane.add(lblApellidoPaterno);
		
		txtApellidoPaterno = new JTextField("    dEl     roSaRIo     ");
		txtApellidoPaterno.setBounds(120, 10, 200, 23);
		contentPane.add(txtApellidoPaterno);
		txtApellidoPaterno.setColumns(10);

		lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(10, 35, 100, 23);
		contentPane.add(lblApellidoMaterno);

		txtApellidoMaterno = new JTextField("           león   vELarde  ");
		txtApellidoMaterno.setBounds(120, 35, 200, 23);
		contentPane.add(txtApellidoMaterno);
		txtApellidoMaterno.setColumns(10);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 60, 100, 23);
		contentPane.add(lblNombres);

		txtNombres = new JTextField(" PeDRo  alBERto ramón  franCisco");
		txtNombres.setBounds(120, 60, 200, 23);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(635, 10, 89, 23);
		contentPane.add(btnProcesar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(635, 35, 89, 23);
		contentPane.add(btnLimpiar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 714, 330);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(arg0);
		}  
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		String apellidoPaterno = leerApellidoPaterno(),
		       apellidoMaterno = leerApellidoMaterno(),
		       nombres = leerNombres();
		apellidoPaterno = Libreria.soloUnEspacioEntrePalabras(apellidoPaterno);
		apellidoMaterno = Libreria.soloUnEspacioEntrePalabras(apellidoMaterno);
		nombres = Libreria.soloUnEspacioEntrePalabras(nombres);
		imprimir("Docente :  " + Libreria.dataCorregida(apellidoPaterno, apellidoMaterno, nombres));
	}
	protected void actionPerformedBtnLimpiar(ActionEvent arg0) {
		txtApellidoPaterno.setText("");
		txtApellidoMaterno.setText("");
		txtNombres.setText("");
		txtApellidoPaterno.requestFocus();
	}
	
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	//  Métodos con valor de retorno (sin parámetros)
	String leerApellidoPaterno() {
		return txtApellidoPaterno.getText().trim();
	}
	String leerApellidoMaterno() {
		return txtApellidoMaterno.getText().trim();
	}
	String leerNombres() {
		return txtNombres.getText().trim();
	}
	
}