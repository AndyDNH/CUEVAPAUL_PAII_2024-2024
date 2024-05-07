package Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Model.Alien_Ship;
import Model.Ammo;
import Model.Spaceship;
import interface_package.IDraw;
import interface_package.IMovement;

public class Container  {
	Spaceship ship = new Spaceship();
	Ammo bullet = new Ammo();
	List<Alien_Ship> opponents = new ArrayList<Alien_Ship>();
	final int SCREEN_WIDTH = 700;
	final int SCREEN_HEIGHT = 300;
	Random random = new Random();
	
	public Container() {
		opponents.add(new Alien_Ship(random.nextInt(SCREEN_WIDTH),random.nextInt(SCREEN_HEIGHT)));
		opponents.add(new Alien_Ship(random.nextInt(SCREEN_WIDTH),random.nextInt(SCREEN_HEIGHT)));
		opponents.add(new Alien_Ship(random.nextInt(SCREEN_WIDTH),random.nextInt(SCREEN_HEIGHT)));
		opponents.add(new Alien_Ship(random.nextInt(SCREEN_WIDTH),random.nextInt(SCREEN_HEIGHT)));
		
	}

	public void draw(Graphics g) {
		ship.draw(g);
		for (int i = 0; i < opponents.size(); i++) {
			opponents.get(i).draw(g);
		}
		bullet.draw(g);
				
	}
	
	public void moveUp(int var) {
		
	}
	public void moveDown(int var) {
		for (int i = 0; i < opponents.size(); i++) {
			opponents.get(i).moveDown(var);
		}
		
	}
	public void moveLeft(int var) {
		ship.moveLeft(var);
	}
	public void moveRight(int var) {
		ship.moveRight(var);
	};
	
	public void drawShoot(Graphics g) {
		new Ammo().draw(g, ship);
	}
	
	



}
