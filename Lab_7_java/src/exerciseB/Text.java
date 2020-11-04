package exerciseB;

import java.awt.Graphics;

public class Text implements Component {
	private String text;
	int x,y;
public Text(String text, int x, int y) {
	this.text=text;
	this.x=x;
	this.y=y;
}
@Override
public void draw(Graphics g) {

	 g.drawString(text, x, y);
}
}
