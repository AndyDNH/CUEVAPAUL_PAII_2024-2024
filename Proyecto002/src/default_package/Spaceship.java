package default_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import interface_package.IDraw;
import interface_package.IMovement;

public class Spaceship extends JPanel implements IDraw,IMovement {
	
	private Graphics g;	
	private int x = 50; // Coordenada x inicial del triángulo
    private int y = 50; // Coordenada y inicial del triángulo

    public Spaceship() {
        setFocusable(true); // Permitir que el panel obtenga el foco para recibir eventos de teclado
    }
    
    
	@Override
	public void movement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image draw(int width, int height, Color color) {
		
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(color);
        Path2D path = new Path2D.Double();
        path.moveTo(width / 2.0, 0);
        path.lineTo(0, height);
        path.lineTo(width, height);
        path.closePath();
        g2d.fill(path);
        g2d.dispose();
        return image;
	}
	


    public void setTrianglePosition(int newX, int newY) {
        x = newX;
        y = newY;
        repaint(); // Volver a dibujar el triángulo después de moverlo
    }
	
	

}
