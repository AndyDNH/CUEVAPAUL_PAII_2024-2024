package default_package;

import interface_package.Interface_Figuras;

public class Dibujar implements Interface_Figuras{

	@Override
	public void DibujarFiguras() {
		System.out.println("Dibujar Triangulo");
		
	}

}
