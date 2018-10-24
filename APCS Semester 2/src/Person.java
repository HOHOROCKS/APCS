
public class Person {
	private String name;
	private int age;
	private double weight;
	
	public Person(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	
	
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public double getweight(){
		return weight;
	}
	/*public String toString(){
		return name + " " + age + " " + weight;
	}
	*/
	public String toString(){
		return "{" + this.name + ", " + this.age + ", " + this.weight + "}";
	}
}
