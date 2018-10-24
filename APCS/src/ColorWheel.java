import java.awt.Color;
import java.awt.Graphics;

public class ColorWheel {
	public static void main (String[] args){
		DrawingPanel p = new DrawingPanel(512,512);
		Graphics g = p.getGraphics();
		
		g.drawOval(0,0,512,512); //draws oval
		
		for (float theta  = 0; theta <=360; theta +=0.1){ //prints each line 
			for (float radian = 0; radian<=256; radian+=0.1){ //not sure why its called radian but it gets the color and each pixel in the line 
				g.setColor((Color.getHSBColor((float)(theta+90)/360,radian/256,1))); //sets a color for the following line, which draws a pixel
				g.drawOval((int)(256+radian*Math.cos(theta*Math.PI/180)), 256+(int)(radian*Math.sin(theta*Math.PI/180)), 1,1); //draws a pixel
				
			}
		g.fillOval(103, 78, 50, 50); //pixels change color based on the last pixel in the line above
		g.fillOval(334, 78, 50, 50);
		g.fillRect(128, 320, 256, 30);
		g.fillRect(128, 260, 30, 75);
		g.fillRect(256+128-30, 260, 30, 75);
		}
	}
}
