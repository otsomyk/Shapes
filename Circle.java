package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);

		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));

		g.drawOval(200, 110, 60, 60);

		g.setColor(Color.GREEN);
		g.fillOval(199, 109, 59, 59);
	}

}
