import java.awt.Point;

public class PointClient {
	public static void main(String[] args){
		Point moo = new Point(3,3);
		moo.translate(2, 2);
		moo.setXY1(0,0);
		moo.translate(0, 19);
		moo.setXY1((int)moo.getY(), (int)moo.getX());
		System.out.println("moo = " + "(" + moo.getX() + ", " + moo.getY() + ")");
	}

}
