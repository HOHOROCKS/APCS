import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

 
public class Clump {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	System.out.println();
    	System.out.println("Please enter a sequence of strings separated");
    	System.out.println("by spaces. End the sequence with the sentinel");
    	System.out.println("value \"stop\", followed by a return.");
    	System.out.println();
    	System.out.print("Your original list: ");
        Scanner kb = new Scanner(System.in);
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        String bob = kb.next();
        
        kb.close();
        if (a.size()%2 ==0){
        	for (int i = 0; i<a.size()-1; i+=2)
        		temp.add("("+a.get(i) + " " + a.get(i+1) + ")");
        }
        else{
        	for (int i = 0; i<a.size()-1; i+=2)
        		temp.add("("+a.get(i) + " " + a.get(i+1) + ")");
        	temp.add(a.get(a.size()-1));
        }
        System.out.println(a);
        System.out.println();
        System.out.println("Your clumped list: " + temp);
   }
}