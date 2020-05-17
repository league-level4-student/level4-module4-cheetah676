package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	public static BufferedImage dog;
public ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		try {
			dog=ImageIO.read(this.getClass().getResourceAsStream("23928de8-75f4-4cbd-aa93-a6f68ad330f7-20200201-_MS_0622.webp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(dog, x, y, width, height, null);
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
	}

	}
