package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    int getX() {
    	return x;
    }
    int setX(int newX) {
    	x=newX;
    	return x;
    }
    protected int y;
    int getY() {
    	return y;
    }
    int setY(int newY) {
    	y=newY;
    	return y;
    }
    protected int width;
    int getWidth() {
    	return width;
    }
    int setWidth(int newWidth) {
    	width=newWidth;
    	return width;
    }
    protected int height;
    int getHeight() {
    	return height;
    }
    int setHeight(int newHeight) {
    	height=newHeight;
    	return height;
    }
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width=width;
   	 this.height=height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
