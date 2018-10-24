import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
 
public class hi{
    public static void main(String[] args){
    	ArrayList<Integer>list1 = new ArrayList<>();
    	ArrayList<Integer>list2 = new ArrayList<>();
     	ArrayList<Integer>list3 = new ArrayList<>();
        int k =0;
        System.out.println();
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        while (console.hasNext()){
        	list1.add(console.nextInt());
        	if (list1.get(list1.size()-1)==0){
        		list1.remove(list1.size()-1);
        		break;
        	}
        }
        System.out.print("Your first list: ");
        while (console.hasNext()){
        	list2.add(console.nextInt());
        	if (list2.get(list2.size()-1)==0){
        		list2.remove(list2.size()-1);
        		break;
        	}
        }
        System.out.println(list1);
        System.out.println();
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.");
        System.out.println();
        System.out.print("Your second list: ");
        System.out.println(list2);
        System.out.println();
        if(list2.size() > (list1.size())){
        	int count = 0;
        	for(int i = 0; i < list1.size(); i++){
        		count++;
        		list3.add(list1.get(i));
        		list3.add(list2.get(i));
        	}
        	for(int i = count; i < list2.size(); i++){
        		list3.add(list2.get(i));
        	}
        }else {
         	int count = 0;
        	for(int i = 0; i < list2.size(); i++){
        		count++;
        		list3.add(list1.get(i));
        		list3.add(list2.get(i));
        	}
        	for(int i = count; i < list1.size(); i++){
        		list3.add(list1.get(i));
        	}
        	
        }
        System.out.println("Your interleaved list: " +list3);
        /*
        int j = 1;
        System.out.println(list1);
        
        if (list2.size() > list1.size()){
        	for	(int i = 0;i<list1.size();i++){
        		list3.add(i, list1.get(i));
        		list3.add(i+1,list2.get(i));
        		
        	}
            System.out.println(list3);
        }
        else {
        	for(int i =0;i<list2.size();i++){
            list1.add(k,list2.get(i));
            k+=2;
        	}
        }
        */


    }
    	
}