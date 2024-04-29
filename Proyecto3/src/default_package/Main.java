package default_package;

public class Main {

	public static void main(String[] args) {
		Container contain = new Container();
		contain.draw(new Circle());
		contain.draw(new Triangle());
		contain.draw(new Square());
	}

}
