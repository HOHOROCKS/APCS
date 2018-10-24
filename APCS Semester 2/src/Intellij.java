import java.util.Scanner;

public class Intellij {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println(F(a, b));
    }
    public static int F(int x, int y){
        if (y > x){
            return 0;
        }
        else if (x == 0 && y == 0){
            return 1;
        }
        else {
            return F(x-1, y) + F(x, y-1);
        }
    }

}
