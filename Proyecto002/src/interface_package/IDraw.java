package interface_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

import Model.Core_Ship;

public interface IDraw{
	


	public void draw(Graphics g);
	public void draw(Graphics g,Core_Ship core);
	
}
