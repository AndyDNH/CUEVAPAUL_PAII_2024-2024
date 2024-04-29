package default_package;

import interface_package.IDraw;

public class Circle implements IDraw{

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		
	}
}
