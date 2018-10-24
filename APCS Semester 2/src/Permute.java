import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
 
public class Permute {
 
    public static TreeSet<String> set = new TreeSet<String>();
   
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input string: ");
        String base = console.next();
 
        permute("",base);
        Iterator index = set.iterator();
        while (index.hasNext()) {
            System.out.println(index.next());
        }
    }
 
    public static void permute(String s1, String s2) {
        if (s2.length() == 0)
            set.add(s1);
        else {
            for (int i = 0; i < s2.length(); i++) {
                permute (s1 + s2.charAt(i), s2.substring(0,i) + s2.substring(i + 1, s2.length()));
            }
        }
    }
}