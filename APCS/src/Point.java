import javax.swing.plaf.synth.SynthSeparatorUI;

public class Point{
	int x;
	int y;
	public Point(int initialX, int initialY){
		x = initialX;
		y = initialY;
	}
	public Point(){
		
	}
	public void translate(int dx, int dy){
		x += dx;
		y += dy;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setXY(int nx, int ny){
		this.x = nx;
		this.y = ny;
	}
	public String toString(){
		String desired = "(" + x + ", " + y + ")";
		return desired;
	}
	public int getQuadrant(){
		if (x >0){
			if (y > 0){
				return 1;
			}
			else if (y < 0){
				return 4;
			}
		}
		else if (x < 0){
			if (y>0){
				return 2;
			}
			else if (y <0){
				return 3;
			}
		}
			return 0;
	}
	public double distanceToOrigin(){
		double distance = Math.sqrt(x*x+y*y);
		return distance;
	}
	public double slope(Point s){
		int nx = s.getX();
		int ny = s.getY();
		double slope = (double) (ny - y)/(nx-x);
		return slope;
	}
}