package interface_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

public interface IDraw{
	


	public void draw(Graphics g);
	public void draw(Graphics g,IDraw drawable);
	
}
