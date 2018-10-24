import java.util.ArrayList;
import java.util.Scanner;

public class People {
	public static void main(String[] args){
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> age = new ArrayList<>();
		ArrayList<Double> weight = new ArrayList<>();
		Scanner console = new Scanner(System.in);
		while(console.hasNextLine()){
			name.add(console.next());
			if (name.get(name.size()-1).equals("stop")) {
				name.remove(name.size()-1);
				break;
			}
			age.add(console.nextInt());
			weight.add(console.nextDouble());
		}
		
		System.out.println("Original list: ");
		
		
		ArrayList<Person> persons = new ArrayList<>();
		for (int i = 0; i < name.size(); i ++){
			persons.add( new Person(name.get(i), age.get(i), weight.get(i)));
		}
		
		System.out.println(persons);
		
		for (int i = 0; i < name.size() - 1; i++){
			for (int j = 0; j < name.size() - i - 1; j++){
				if (persons.get(j).getname().compareTo(persons.get(j+1).getname()) == 0 ){
					if (persons.get(j).getage() > persons.get(j+1).getage()){
						Person temp = persons.get(j);
						persons.set(j, persons.get(j+1));
						persons.set(j+1, temp);
					}
					else if (persons.get(j).getage() == persons.get(j+1).getage()){
						if (persons.get(j).getweight() > persons.get(j+1).getweight()){
							Person temp = persons.get(j);
							persons.set(j, persons.get(j+1));
							persons.set(j+1, temp);
						}
					}
				}
				else if (persons.get(j).getname().compareTo(persons.get(j+1).getname()) > 0){
					Person temp = persons.get(j);
					persons.set(j, persons.get(j+1));
					persons.set(j+1, temp);
				}
			}
		}
		for (int i = 0; i < persons.size(); i++){
			persons.get(i).toString();
		}
		System.out.println();
		System.out.println("Sorted list: ");
		System.out.println(persons);
	}
}
