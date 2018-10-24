import java.util.ArrayList;

public class Sort {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 10; i > 0; i--){
			a.add(i);
		}
		
		for (int i = 1; i < a.size(); i ++){
			for (int j = 0; j < a.size(); j ++){
				if(a.get(j) > a.get(i)){
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j,  temp);
				}
			}
		}
		System.out.println(a);
	}
}
