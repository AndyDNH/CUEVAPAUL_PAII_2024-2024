package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import interface_package.IDraw;
import interface_package.IMovement;

public class Spaceship extends Core_Ship {
	
	int [] cord_x = {400,450,350};  // Coordenada x inicial del triángulo
    int [] cord_y = {500,550,550}; // Coordenada y inicial del triángulo

    

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillPolygon(cord_x,cord_y,3);
		
	}


	@Override
	public void moveUp(int var) {
		for (int i = 0; i < cord_x.length; i++) {
			cord_y[i]  = cord_y[i] - var;
		} 
		
		
	}



	@Override
	public void moveDown(int var) {
		for (int i = 0; i < cord_x.length; i++) {
			cord_y[i]  = cord_y[i] + var;
		} 
		
	}



	@Override
	public void moveLeft(int var) {
		for (int i = 0; i < cord_x.length; i++) {
			cord_x[i]  = cord_x[i] - var;
		} 
		
	}



	@Override
	public void moveRight(int var) {
		for (int i = 0; i < cord_x.length; i++) {
			cord_x[i]  = cord_x[i] + var;
		} 
		
	}



	@Override
	public void draw(Graphics g, Core_Ship core) {
		// TODO Auto-generated method stub
		
	}
	

}
