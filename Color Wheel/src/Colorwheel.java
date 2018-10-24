import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Colorwheel {
	 public static void main(String[] args){
		 DrawingPanel a = new DrawingPanel(512,512);
		 Graphics g = a.getGraphics();
		 g.drawOval(0, 0, 512, 512);
		 for (int i = 0; i <= 255; i++){
			 
			 g.fillArc(256, 256, 1, 512, i, i);
		 }
	 }
}
