package clases;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vista miVista = new Vista();
		Inmoviliaria misPropiedades = new Inmoviliaria();
		
		// Crear un objeto Controlador (programa los eventos)
		Controlador ctr = new Controlador(miVista,misPropiedades);
		// Llamar al método que añade "control" a los componentes
		miVista.control(ctr);
		
		// Crear el objeto Ventana (JFrame)
		JFrame ventana = new JFrame("inmoviliaria");
		ventana.setContentPane(miVista);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);

	}

}
