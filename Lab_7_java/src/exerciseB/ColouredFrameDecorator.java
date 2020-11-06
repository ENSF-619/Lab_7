package exerciseB;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/*
 * ColouredFrameDecorator.java
 * Lab:7-Exercise B & C
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
public class ColouredFrameDecorator extends Decorator {
protected int thickness;
	public ColouredFrameDecorator(Component t, int x, int y, int width, int height, int thickness) {
		cmp=t;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.thickness=thickness;
	}

	@Override
	public void draw(Graphics g) {
		cmp.draw(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(thickness));
		g2.setColor(Color.red);
		Rectangle r=new Rectangle(x,y,width, height);
		g2.draw(r);
	}



}
