package _03_polymorphs;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ImageMorph extends Polymorph{

	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(23928de8-75f4-4cbd-aa93-a6f68ad330f7-20200201-_MS_0622.webp, x, y, width, height);
	}

	}
