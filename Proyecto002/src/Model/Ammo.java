package Model;

import java.awt.Color;
import java.awt.Graphics;

import interface_package.IDraw;
import interface_package.IMovement;

public class Ammo extends Core_Ship {


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp(int var) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(int var) {
		// TODO Auto-generated method stub
		
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
	public void draw(Graphics g, Core_Ship core) {
		g.setColor(Color.WHITE);
		g.fillOval(((Spaceship) core).cord_x[0]+10,((Spaceship) core).cord_y[1]-100, 10, 10);
		
	}

}
