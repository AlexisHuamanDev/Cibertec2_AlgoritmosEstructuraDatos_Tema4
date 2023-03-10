package gui;

import lib.Libreria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ejemplo extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setTitle("Ejemplo - Semana_04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 563);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 14));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	/** 
     * 	             .---.---.---.---.---.---.---.---.---.---.---.---.---.
     *	cadena  ==>  |'J'|'a'|'v'|'a'|' '|'e'|'s'|' '|'m'|'e'|'j'|'o'|'r'|
     *               '---'---'---'---'---'---'---'---'---'---'---'---'---'
     *                 0   1   2   3   4   5   6   7   8   9   10  11  12
	 */
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		/** Métodos básicos de la clase String */
		String cadena = "Java es mejor";
		imprimir("cadena :  " + cadena);
		imprimir();
		
		/** 1)  Método length */
		int longitud  = cadena.length();
		imprimir("longitud :  " + longitud);
		imprimir();
		
		/** 2)  Método charAt */
		char primerCaracter = cadena.charAt(0);
		imprimir("primer carácter :  " + primerCaracter);
		char ultimoCaracter = cadena.charAt(longitud - 1);
		imprimir("último carácter :  " + ultimoCaracter);
		imprimir();
		
		/** 3)  Método equals */
        String cad1 = "Java es lo máximo";
		boolean sino1 = cadena.equals(cad1); 
		imprimir(cadena + " == " + cad1 + " :  " + sino1);		
        String cad2 = "Java es mejor";
        boolean sino2 = cadena.equals(cad2);      
        imprimir(cadena + " == " + cad2 + " :  " + sino2);
	    String cad3 = "Java gusta a todos";
	    boolean sino3 = cadena.equals(cad3);      
        imprimir(cadena + " == " + cad3 + " :  " + sino3);
	    String cad4 = "Java es mejor hoy";
	    boolean sino4 = cadena.equals(cad4);      
        imprimir(cadena + " == " + cad4 + " :  " + sino4);
		imprimir();     
		
		/** 4)  Método compareTo */
        int ok1 = cadena.compareTo(cad1); 
        imprimir(cadena + " == " + cad1 + " :  " + ok1);
        int ok2 = cadena.compareTo(cad2);
        imprimir(cadena + " == " + cad2 + " :  " + ok2);      
        int ok3 = cadena.compareTo(cad3);
        imprimir(cadena + " == " + cad3 + " :  " + ok3);
        int ok4 = cadena.compareTo(cad4);
        imprimir(cadena + " == " + cad4 + " :  " + ok4);
        imprimir();
		
        /** Concatenación */
        String cad5 = "Ciber" + "Java" + '_' + 2020;
        imprimir("cad5 :  " + cad5);
        imprimir();
        
        /** Recorrido */
        for (int i=0; i<cadena.length(); i++) {
        	txtS.append(cadena.charAt(i) + "  ");
       	}
        imprimir();
        for (int i=cadena.length()-1; i>=0; i--) {
        	txtS.append(cadena.charAt(i) + "  ");
       	}
        imprimir();
        imprimir();
		imprimir("--------------------------------------------");
		imprimir("valor de PI            :  " + Libreria.PI);
		imprimir("# aletorio de 3 cifras :  " + Libreria.aleatorio(100,999));
		imprimir("--------------------------------------------");
		imprimir();
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}