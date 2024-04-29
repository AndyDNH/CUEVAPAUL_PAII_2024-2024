package default_package;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Container contain = new Container();
		contain.draw(new Alien_Ship());
		contain.draw(new Spaceship());
		contain.draw(new Ammo());
		
		contain.movement(new Alien_Ship());
		contain.movement(new Spaceship());
		contain.movement(new Ammo());
		
//		JFrame vent  = new JFrame("Espacio inf");
//
//		vent.setSize(700,700);
//		vent.setVisible(true);
//		vent.setResizable(false);
//		vent.setLocationRelativeTo(null);
//		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Layouts layout = new Layouts();
		layout.movement();
		

	}
	
//	public void paint(Graphics g) {
//		
//		g.setColor(Color.GREEN);
//        g.fillRect(150, 270, 50, 70);
//	}

}
