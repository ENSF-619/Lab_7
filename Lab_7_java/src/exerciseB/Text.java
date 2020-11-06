package exerciseB;

import java.awt.Graphics;
/*
 * Text.java
 * Lab:7-Exercise B & C
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
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
