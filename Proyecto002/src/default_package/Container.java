package default_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.desktop.AboutEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import interface_package.IDraw;
import interface_package.IMovement;

public class Container  {
	Graphics g;
	

	public void draw(IDraw d) {
	 d.draw(50,50,Color.WHITE);
				
	}
	
	public void movement(IMovement m) {
		m.movement();
	}



}
