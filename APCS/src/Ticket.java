
public class Ticket {
	private int number;
	public Ticket(int number){
		this.number=number;
	}
	public int getNum(){
		return number;
	}
	public double getPrice(){
		return 50;
	}
	public String toString(){
		return "Number: " + number+ ", Price: " + getPrice();
	}
}
