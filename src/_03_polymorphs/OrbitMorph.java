package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class OrbitMorph extends Polymorph{
double i=-1000000;
	OrbitMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
g.setColor(Color.CYAN);		
g.fillOval(x, y, width, height);
	}
public void update() {
	double speed=Math.PI/16;
	double radian=speed*i;
	  double increaseX = 5 * Math.cos(radian);
	    double increaseY = 5 * Math.sin(radian);
	    x+=increaseX;
	    y+=increaseY;
	    y+=.9;
	    x+=.9;
	    i+=.5;
}
}
