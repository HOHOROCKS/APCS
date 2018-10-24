import java.awt.*;
import java.util.*;

public class Sierpinski{
    public static final int SIZE=800;
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int level=s.nextInt();
		DrawingPanel panel = new DrawingPanel(SIZE,SIZE);
		Graphics g = panel.getGraphics();
        Point p1 = new Point(0,SIZE);
        Point p2 = new Point(SIZE, SIZE);
        Point p3 = new Point(SIZE/2, 107);
        drawFigure(level, g, p1, p2, p3);
    }
    public static void drawFigure(int level, Graphics g, Point p1, Point p2, Point p3){
        if(level==1){
            Polygon p=new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            g.fillPolygon(p);
        }else{
            Point p4=m(p1, p2);
            Point p5=m(p3, p2);
            Point p6=m(p1, p3);
            drawFigure(level-1, g, p1, p4, p6);
            drawFigure(level-1, g, p2, p4, p5);
            drawFigure(level-1, g, p3, p5, p6);
            
            
        }
    }
    public static Point m(Point a, Point b){
        return new Point ((a.x+b.x)/2, (a.y+b.y)/2);
    }
}