
public class HelloWorld {

	public static int stars = 10;
	public static void main(String[] args) {
		System.out.println("Hello World");
		triangle();
	}

	public static void triangle() {
		for (int i = 1; i <= stars; i++){
			for (int j = 1; j <= i + 1; j++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}
