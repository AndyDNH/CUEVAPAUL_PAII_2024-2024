package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.Random;

import interface_package.IDraw;
import interface_package.IMovement;

public class Alien_Ship extends Core_Ship {
	
	private int [] cord_x ;  // Coordenada x inicial del triángulo
    private int [] cord_y; // Coordenada y inicial del triángulo
    
    public Alien_Ship(int randomX,int randomY) {
    	cord_x = new int[]{0,100,100,50,0}; 
    	cord_y = new int[]{0,0,100,50,100}; 
    	cord_x[0] = 0 + randomX;
    	cord_x[1] = 100 + randomX;
    	cord_x[2] = 100 + randomX;
    	cord_x[3] = 50 + randomX;
    	cord_x[4] = 0 + randomX;
    	
    	cord_y[0] = cord_y[0] + randomY;
    	cord_y[1] = cord_y[1] + randomY;
    	cord_y[2] = cord_y[2] + randomY;
    	cord_y[3] = cord_y[3] + randomY;
    	cord_y[4] = cord_y[4] + randomY;
    	
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillPolygon(cord_x,cord_y,5);
		
	}

	@Override
	public void moveUp(int var) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(int var) {
		for (int i = 0; i < cord_y.length; i++) {
			cord_y[i] = cord_y[i] + var;
		}
		
	}

	@Override
	public void moveLeft(int var) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight(int var) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g, IDraw drawable) {
		// TODO Auto-generated method stub
		
	}
}
