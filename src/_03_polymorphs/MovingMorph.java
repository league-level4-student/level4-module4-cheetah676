package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	boolean direction;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
public void update() {
	if(x>450 || y>450) {
	direction=false;
	}
	else if(x<0 || y<0) {
	direction=true;
	}
if(direction==true) {
	x+=5;
	y+=5;
}
else if(direction==false) {
	x-=5;
	y-=5;
}
}
}
