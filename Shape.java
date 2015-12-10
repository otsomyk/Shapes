package shapes;

import java.awt.Graphics;

public class Shape {

	private String color;

	public Shape() {

	}

	public String getColor() {
		return color;
	}

	public void setNewColor(String color) {
		this.color = color;
	}

	public void draw(Graphics g) {
		throw new IllegalStateException("I can't draw this shape");
	}

	public void printSelf() {
		System.out.println("shape");
	}
}
