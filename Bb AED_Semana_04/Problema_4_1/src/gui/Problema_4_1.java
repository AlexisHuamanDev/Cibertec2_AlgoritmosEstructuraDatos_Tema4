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

public class Problema_4_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblTexto;
	private JTextField txtTexto;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_4_1 frame = new Problema_4_1();
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
	public Problema_4_1() {
		setTitle("Problema_4_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTexto = new JLabel("Ingrese texto");
		lblTexto.setBounds(10, 10, 80, 23);
		contentPane.add(lblTexto);
		
		txtTexto = new JTextField("             Java   es      mejor   en    Cibertec             ");
		txtTexto.setBounds(90, 10, 500, 23);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
				
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(635, 10, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(635, 35, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 714, 365);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(arg0);
		}  
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		String texto = leerTexto();
		txtS.setText("");
		if (Libreria.longitud(texto) > 0) {
			imprimir("ingreso de texto validado  :  " + texto);
			imprimir("longitud de texto validado :  " + Libreria.longitud(texto));
			imprimir("primer carácter            :  " + Libreria.primerCaracter(texto));
			imprimir("último carácter            :  " + Libreria.ultimoCaracter(texto));
			
			texto = Libreria.soloUnEspacioEntrePalabras(texto);
			
			imprimir("");
			imprimir("texto ajustado             :  " + texto);
			imprimir("longitud de texto ajustado :  " + Libreria.longitud(texto));
			imprimir("cantidad de palabras       :  " + Libreria.cantidadDePalabras(texto));
			imprimir("texto en minúsculas        :  " + Libreria.enMinusculas(texto));
			imprimir("texto en mayúsculas        :  " + Libreria.enMayusculas(texto));
			imprimir("espacios por guiones       :  " + Libreria.espaciosPorGuiones(texto));
			imprimir("posicón del primer espacio :  " + Libreria.posPrimerEspacio(texto));
			imprimir("primera palabra            :  " + Libreria.primeraPalabra(texto));
			imprimir("posicón del último espacio :  " + Libreria.posUltimoEspacio(texto));
			imprimir("última palabra             :  " + Libreria.ultimaPalabra(texto));
			imprimir("texto sin primera palabra  :  " + Libreria.sinPrimeraPalabra(texto));
			imprimir("texto sin última palabra   :  " + Libreria.sinUltimaPalabra(texto));
			imprimir("primera palabra al final   :  " + Libreria.primeraPalabraAlFinal(texto));
			imprimir("última palabra al inicio   :  " + Libreria.ultimaPalabraAlInicio(texto));
		}
		else
			txtTexto.requestFocus();

	}
	protected void actionPerformedBtnBorrar(ActionEvent arg0) {
		txtS.setText("");
		txtTexto.setText("");
		txtTexto.requestFocus();
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
	String leerTexto() {
		return txtTexto.getText().trim();
	}
	
}