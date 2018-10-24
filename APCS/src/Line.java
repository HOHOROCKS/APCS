
public class Line {
	Vect2 a;
	Vect2 b;
	public Line (Vect2 a, Vect2 b){
		this.a = a;
		this.b = b;
	}
	public Line rotate(double angle, Vect2 center){
		a = a.rotate(angle, center);
		b = b.rotate(angle, center);
		return new Line(this.a, this.b);
	}
	public Line translate(Vect2 transform){
		a = a.add(transform);
		b = b.add(transform);
		return new Line(this.a, this.b);
	}
	public double length(){
		double sum1 = (a.subtract(b)).magnitude();
		return sum1;
	}
	public String toString(){
		return "(" + this.a.toString() + ", " + this.b.toString() + ")";
	}
}
