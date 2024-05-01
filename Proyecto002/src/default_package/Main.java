package default_package;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import Controller.Container;
import View.Layouts;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame ventana = new JFrame("Galaga");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
		Layouts layout = new Layouts();
		ventana.add(layout);
		ventana.setVisible(true);
		

	}
	

}
