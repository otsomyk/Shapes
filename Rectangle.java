package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke (10));
		
		
		g.drawRect(10, 30, 100, 20);
		
		g.setColor(Color.YELLOW);
		g.fillRect(11, 31, 99, 19);
	

	}
}
