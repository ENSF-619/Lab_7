package exerciseB;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ColouredGlassDecorator extends Decorator {

	public ColouredGlassDecorator(Component t, int x, int y, int width, int height) {
		cmp=t;
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.yellow);
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));
		g2d.fillRect(25, 25, 110, 110);
	
	}

}
