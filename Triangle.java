package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangle extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);

		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(10));
		int[] arrayX = {20, 100, 100};
		int[] arrayY = {180, 200, 100};
		g.drawPolygon(arrayX, arrayY, 3);

		g.setColor(Color.RED);
		g.fillPolygon(arrayX, arrayY, 3);
	}
}
