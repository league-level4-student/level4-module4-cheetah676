package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList <Polymorph> polymorphs;
	   
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	 

   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 
   	polymorphs=new ArrayList <Polymorph>();
  	 polymorphs.add(new BluePolymorph(50, 50, 50, 50));
  	 polymorphs.add(new RedMorph(110, 110, 50, 50));
  	 polymorphs.add(new MovingMorph(0, 0, 50, 50));
  	 polymorphs.add(new OrbitMorph(50, 25, 50, 50));
  	 polymorphs.add(new CatMorph(250, 250, 50, 50));
  	 polymorphs.add(new ImageMorph(150, 150, 150, 150));
  	 polymorphs.add(new MessageMorph(310, 310, 50, 50));
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for(Polymorph morph:polymorphs) {
 		 morph.draw(g);
 	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(Polymorph morph:polymorphs) {
 		 morph.update();
 	 }
    }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Point p = MouseInfo.getPointerInfo().getLocation();
		if(p.x>316 && p.x<368 && p.y>339 && p.y<390) { 
		JOptionPane.showMessageDialog(null, "Stop clicking me");
		}
		
		System.out.println(p.x);
		System.out.println(p.y);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
