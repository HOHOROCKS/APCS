import java.util.Scanner;
import java.awt.*;

public class Projectile {
	public static final double ACCELERATION = -9.81;
	public static final double VELOCITY = 99.8;

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);
		System.out.print("Initial angle (degrees)? ");
		double intangle = Math.toRadians(console.nextDouble());
		System.out.print("Final angle (degrees)? ");
		double finangle = Math.toRadians(console.nextDouble());
		System.out.print("Please enter the step size in degrees: ");
		double steps = Math.toRadians(console.nextDouble());

		
		System.out.println();
		console.close();
		
		DrawingPanel panel = new DrawingPanel(1020, 620);
		Graphics g = panel.getGraphics();
		Font Title = new Font("Times New Roman",Font.PLAIN,25);
		g.setFont(Title);
		g.drawString("Projectile Map", 1000/2-75, 50);
		Font axis = new Font("Times New Roman",Font.PLAIN,10);
		g.setFont(axis);
		g.drawLine(14,590,1020,590);
		g.drawLine(14,0,14,590);
		for(int i = 0; i<=1000; i+=50){
			g.drawString(""+i, 10+i, 600);
			g.drawLine(i+15,585,i+15,590);
		}
		for(int i = 0; i<600; i+=50){
			g.drawString(""+i, 0, 590-i);
			g.drawLine(14,i-14,19,i-14);
		}

		
		for (int i = 0; i <= (int) ((finangle - intangle)/steps); i++){
			double x = 0.0;
			double y = 0.0;
			double t = 0.0;

			double angle = intangle + i * steps;
			double xVelocity = VELOCITY * Math.cos(angle);
			double yVelocity = VELOCITY * Math.sin(angle);
			double totalTime = -2.0 * yVelocity / ACCELERATION;
			double timeIncrement = totalTime / 100;
			double xIncrement = xVelocity * timeIncrement;

			System.out.println("step\tx\ty\ttime");
			System.out.println("0\t0.0\t0.0\t0.0");
			for (int j = 1; j <= 100; j++){
				
				t += timeIncrement;
				x += xIncrement;
				y = yVelocity * t + 0.5 * ACCELERATION * t * t;
				System.out.println((int) (i) + "\t" + round2(x) + "\t" +
									round2(y) + "\t" + round2(t));
				g.drawOval( (int) (x) + 20,585 - (int) (y), 2, 2);
				
			}



			}
		

	}
	
	public static double round2(double n) {
		return Math.round(n * 100.0) / 100.0;
	}
	

}
		