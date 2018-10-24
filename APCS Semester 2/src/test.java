/**
 * Created by hohor on 3/22/2018.
 */
public class test {
    public static int COUNT = 0;
    public static void main(String[] args) {
        int x = 4;
        int val = 83767926;
        System.out.println(f(x, val));
        System.out.println(COUNT);
    }
    public static int f(int x, int val) {
        if (x >= val) {
            return x;
        }
        COUNT += 1;
        System.out.println(COUNT);
        return f(x * x, val);
        }
    }


