package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Rectangle {
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);

		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke (10));
		
		
		g.drawRect(200, 200, 60, 60);
		
		g.setColor(Color.BLUE);
		g.fillRect(201, 201, 59, 59);
	}
}
