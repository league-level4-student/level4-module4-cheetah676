package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
public void update() {
	//needs to be fixed
	if(x>PolymorphWindow.WIDTH || y>PolymorphWindow.HEIGHT) {
	x+=1;
	y+=1;
	}
else if(x<PolymorphWindow.WIDTH || y<PolymorphWindow.HEIGHT) {
	x-=1;
	y+=1;
}
}
}
