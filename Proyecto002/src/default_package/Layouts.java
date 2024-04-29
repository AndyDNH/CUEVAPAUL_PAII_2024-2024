package default_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import interface_package.IDraw;
import interface_package.IMovement;

public class Layouts extends JPanel implements KeyListener{
	private JLabel label1;
	Container contains = new Container();
	private int x,y;
	private Spaceship ship;
	
	public Layouts() {
		ship = new Spaceship();
		add(ship);
		ship.addKeyListener(this);
		addKeyListener(this);
		setFocusable(true);
		
	}


	public void movement() {
		setLayout(null);

	    //Tamaño de la ventana
	    setBounds(10,10,800,600);

	    //Título
	    setTitle("Ejemplo 4: JLabel");

	    //No redimensionable
	    setResizable(false);

	    //Cerrar proceso al cerrar la ventana
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

	    /* Creamos el objeto de la clase JLabel y le pasamos como parámetro al constructor el texto a mostrar.*/
	    label1 = new JLabel("Hola Mundo.");

	    /* Ubicamos al objeto de la clase JLabel llamando al método setBounds, este requiere como parámetros la columna, fila, ancho y alto del JLabel. Finalmente llamamos al método add (metodo heredado de la clase JFrame) que tiene como objetivo añadir el control JLabel al control JFrame */
	    label1.setBounds(10,20,200,30);

	    
	    add(label1);
	    


	    //Muestro JFrame (lo último para que lo pinte todo correctamanete)
	    setVisible(true);

		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		contains.draw(new Spaceship());
	}
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		letra A
		if(e.getKeyCode()==65) {
			if (x>0) {
				ship.setTrianglePosition(label1.getX()-5, label1.getY());
				x = x - 5;
				repaint();
			}
		}
//		letra D
		if(e.getKeyCode()==68) {
			if (x<600) {
				ship.setTrianglePosition(label1.getX()+5, label1.getY());
				x = x + 5;
				repaint();
			}
		}
//		letter W
		if(e.getKeyCode()==87) {
			if (y>0) {
				System.out.println("se ejecuta w");
				ship.setTrianglePosition(label1.getX(), label1.getY()-5);
				y = y  - 5;
				repaint();
			}
		}
//		letter S
		if(e.getKeyCode()==83) {
			if (y<600) {
				System.out.println("se ejecuta");
				ship.setTrianglePosition(label1.getX(), label1.getY()+5);
				y = y  + 5;
				repaint();
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




}
