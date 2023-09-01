package co.edu.uptc.test;

public class Test {
	public static void main(String[] args) {
		 MyFrame frame = new MyFrame();
		 frame.setlevel1(new IoManager().readGraphicInt("Ingresa el nivel del triangulo igual o menor a 7"));
	}

}
