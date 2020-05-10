package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class CatMorph extends Polymorph{

	CatMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
g.setColor(Color.YELLOW);
g.fillRect(x, y, width, height);	
	}
public void update() {
	int mouseX=MouseInfo.getPointerInfo().getLocation().x;
	int mouseY=MouseInfo.getPointerInfo().getLocation().y;
	x=mouseX-=30;
	y=mouseY-=30;
}
}
