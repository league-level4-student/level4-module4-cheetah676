package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph{

	MessageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, width, height);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("hi");
		JOptionPane.showMessageDialog(null, "Stop clicking me");
		
	}
}
