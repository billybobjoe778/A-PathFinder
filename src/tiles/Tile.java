package tiles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Tile extends JLabel {

	int x, y;
	int clicker = 0;
	private Color faceColor = Color.WHITE;
	private final static Dimension size = new Dimension(50, 50);

	public Tile(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		setBorder(BorderFactory.createLineBorder(Color.black));
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		setOpaque(true);
		setBackground(c);
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
