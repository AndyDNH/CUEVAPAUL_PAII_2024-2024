package default_package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PruebaLabel {
	
	public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("JLabels con Figuras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear JLabels con diferentes figuras
        JLabel circuloLabel = new JLabel(new ImageIcon(createCircleImage(100, 100, Color.RED)));
        JLabel trianguloLabel = new JLabel(new ImageIcon(createTriangleImage(10, 10, Color.GREEN)));
        JLabel cuadradoLabel = new JLabel(new ImageIcon(createSquareImage(100, 100, Color.BLUE)));

        // Agregar los JLabels al JFrame
        frame.getContentPane().setLayout(new GridLayout(1, 3)); // Usar GridLayout para colocarlos en fila
        frame.getContentPane().add(circuloLabel);
        frame.getContentPane().add(trianguloLabel);
        frame.getContentPane().add(cuadradoLabel);

        // Mostrar el JFrame
        frame.setVisible(true);
    }

    // Método para crear una imagen de círculo
    private static Image createCircleImage(int width, int height, Color color) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(color);
        g2d.fillOval(0, 0, width, height);
        g2d.dispose();
        return image;
    }

    // Método para crear una imagen de triángulo
    private static Image createTriangleImage(int width, int height, Color color) {
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

    // Método para crear una imagen de cuadrado
    private static Image createSquareImage(int width, int height, Color color) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(color);
        g2d.fillRect(0, 0, width, height);
        g2d.dispose();
        return image;
    }
}
