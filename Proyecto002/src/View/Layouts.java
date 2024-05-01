package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import Controller.Container;
import Model.Spaceship;
import interface_package.IDraw;
import interface_package.IMovement;

public class Layouts extends JPanel implements KeyListener{

	Container contains;
	private int x,y;
	private final int MOV_SPEED = 10;
	private final int ALIEN_MOV_SPEED = 1;

	
	public Layouts() {
		setBackground(Color.BLACK);
		setFocusable(true);
		contains = new Container();
		addKeyListener(this);
	
		Timer timer = new Timer(10,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contains.moveDown(ALIEN_MOV_SPEED);
				repaint();
				
			}
		});
		timer.start();

		
	}

	public void paint(Graphics g) {
		super.paint(g);
		contains.draw(g);
	};

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    int keyCode = e.getKeyCode();
	    switch (keyCode) {
	        case KeyEvent.VK_LEFT:
//	            if (x > 0) {
	                contains.moveLeft(MOV_SPEED);
//	            }
	            break;
	        case KeyEvent.VK_RIGHT:
//	            if (x < 600) {
	        	contains.moveRight(MOV_SPEED);
//	            }
	            break;
	        case KeyEvent.VK_UP:
//	            if (y > 0) {
	                System.out.println("se ejecuta w");
//	                contains.moveLeft(MOV_SPEED);

//	            }
	            break;
	        case KeyEvent.VK_DOWN:
//	            if (y < 600) {
	                System.out.println("se ejecuta");
//	                contains.moveLeft(MOV_SPEED);

//	            }
	            break;
	        default:
//	           JOptionPane.showMessageDialog(null, "");
	            break;
	            
	            
	    }
	    repaint();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




}
