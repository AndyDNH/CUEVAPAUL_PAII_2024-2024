package default_package;

import interface_package.IDraw;

public class Square implements IDraw{

	@Override
	public void draw() {
		System.out.println("Draw Square");
		
	}

}
