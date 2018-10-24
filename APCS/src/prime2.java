import java.util.*;
public class prime2{
    public static boolean isPrime(int n){
        if(n % 2 == 0 && n != 2) return false;
        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = n; i > 1; i--){
            if (isPrime(i)){
                System.out.println(i);
                break;
            }
        }
        for (int i = n;;i++){
            if (isPrime(i)){
                System.out.println(i);
                break;
            }
        }
        int m = 0;
        for (int i = 1; i * i <= n; i++){
            if (n % i == 0){
                if (isPrime(i) && i > m) m = i;
                if (isPrime(n / i) && n / i > m) m = n / i;
            }
        }
        System.out.println(m);
    }
}