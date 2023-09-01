package co.edu.uptc.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Iterator;

import javax.swing.JPanel;

public class Triangle extends JPanel {
	private static int level1 = 0;

	public Triangle() {
		setSize(new Dimension(650, 550));
		setVisible(false);
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		int[] x = { getWidth() / 2, 10, getWidth() - 10 };
		int[] y = { 10, getHeight() - 10, getHeight() - 10 };
		drawSierpinskiTriangle(g, x, y, this.level1);
	}

	public static int mediumPoint(int point1, int point2) {
		return (point1 + point2) / 2;
	}

	public static void fillPolygon(Graphics g, int[] x, int[] y, Color color) {
		g.setColor(color);
		g.fillPolygon(x, y, 3);
	}

	public static void drawSierpinskiTriangle(Graphics g, int[] x, int[] y, int level) {
		if (level == 0) {
			fillPolygon(g, x, y, new Color(13, 145, 243));
		}
		if (level > 0 && level < 8) {
			int[] x1 = { x[0], mediumPoint(x[0], x[1]), mediumPoint(x[0], x[2]) };
			int[] y1 = { y[0], mediumPoint(y[0], y[1]), mediumPoint(y[0], y[2]) };
			int[] x2 = { mediumPoint(x[0], x[1]), x[1], mediumPoint(x[1], x[2]) };
			int[] y2 = { mediumPoint(y[0], y[1]), y[1], mediumPoint(y[1], y[2]) };
			int[] x3 = { mediumPoint(x[0], x[2]), mediumPoint(x[1], x[2]), x[2] };
			int[] y3 = { mediumPoint(y[0], y[2]), mediumPoint(y[1], y[2]), y[2] };
			drawSierpinskiTriangle(g, x1, y1, level - 1);
			drawSierpinskiTriangle(g, x2, y2, level - 1);
			drawSierpinskiTriangle(g, x3, y3, level - 1);
		}
	

	}
	
	public void setlevel1(int level) {
		setVisible(true);
		this.level1 = level;
	}

}
