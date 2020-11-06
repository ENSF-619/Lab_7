package exerciseB;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/*
 * BorderDecorator.java
 * Lab:7-Exercise B & C
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
public class BorderDecorator extends Decorator{

	public BorderDecorator(Component t, int x, int y, int width, int height) {
		cmp=t;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
	Graphics2D g2 = (Graphics2D) g;
	float dash[] = { 10.0f };
    g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f));
	
	Rectangle r=new Rectangle(x,y,width, height);
	g2.draw(r);
	}

}
