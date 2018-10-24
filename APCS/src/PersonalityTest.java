import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonalityTest{
	public static final int Personalities = 4;
	public static final int People = 9;
	
	public static void main(String args[]){
		System.out.print("Input file name: ");
		String[] names = new String[People];
		String[][] name_answers = new String[People][2];
		String[][] answers_individualanswers = new String[People][70];
		String[][][] individualanswers_dimensions = new String[People][Personalities][3];
		int[][] percentbie = new int[People][1];
		int[][] percentbsn = new int[People][1];
		int[][] percentbtf = new int[People][1];
		int[][] percentbjp = new int[People][1];
		String[][] personality = new String[People][4];
		Scanner console = new Scanner(System.in);
		String file = console.next();
		console.close();
		try {
			inputsplit(name_answers, file, names);//takes input from a file and splits the file input into the character name and their answers
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		splitstring(name_answers, answers_individualanswers);//takes the names and answers of the respective characters and breaks the answers into individual elements
		matchanswers(answers_individualanswers, individualanswers_dimensions, percentbie, percentbsn, percentbtf, percentbjp, personality);//counts how many A's and B's and -'s
		for (int i = 0; i < People; i++){	// there are for each type of question, then finds their relative frequencies
			if (i!=0){
				System.out.println();
			}
			System.out.println(names[i] + ":");
			System.out.print("    ");
			for (int j = 0; j < Personalities; j++){
				for (int k = 0; k < 2; k++){
					if (individualanswers_dimensions[i][j][k] == null){//catches all exceptions of when an array has no value
						System.out.print("0");
					}
					else{
						System.out.print((int) Double.parseDouble((individualanswers_dimensions[i][j][k])));
					}
					if (k == 0){
						System.out.print("A-");
					}
					else if (k == 1){
						if (j == 3){
							System.out.print("B");
						}else{						
							System.out.print("B ");
						}
					}
				}
			}
			System.out.println();	
			System.out.print("    [");
			System.out.print((int) percentbie[i][0] + "%, ");
			System.out.print((int) percentbsn[i][0] + "%, ");
			System.out.print((int) percentbtf[i][0] + "%, ");
			System.out.print((int) percentbjp[i][0] + "%] = ");
			for (int j = 0; j < Personalities; j++){
				System.out.print(personality[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void inputsplit(String[][] name_answers, String filename, String[] names) throws FileNotFoundException{
		Scanner file = new Scanner(new File(filename));
		int i = 0;
		String name = "";
		while(file.hasNext()){
			String answer = file.next();
			if (answer.length() != 70){
				if (!name.isEmpty()){
					name = name + " " + answer;
				}else{
					name = name + answer;
				}
			}
			else{
				names[i] = name;
				name_answers[i][0] = name;
				name_answers[i][1] = answer;
				name = "";
				i++;
			}
		}
	}
	
	
	public static void splitstring(String[][] name_answers, String[][] answers_individualanswers){
		for (int i = 0; i < People; i++){
			answers_individualanswers[i][0] = name_answers[i][1];
			String answers = name_answers[i][1];
			for (int j = 0; j < 70; j++){
				char x = answers.charAt(j);
				answers_individualanswers[i][j] = Character.toString(x);			
			}
		}
	}
	
	public static void matchanswers(String[][] answers_individualanswers, String[][][] individualanswers_dimensions, int[][] percentbie, int[][] percentbsn, int[][] percentbtf, int[][] percentbjp, String[][] personality2){
		for (int i = 0; i < People; i++){
			double k = 1;
			double l = 1;
			double m = 1;
			double k2 = 1;
			double l2 = 1;
			double m2 = 1;
			double k3 = 1;
			double l3 = 1;
			double m3 = 1;
			double k4 = 1;
			double l4 = 1;
			double m4 = 1;
			for (int j = 0; j < 70; j+=7){ //finds the amounts of Introvert/Extrovert answers
				if (answers_individualanswers[i][j].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][0][0] = Double.toString(k);
					k++;
				}
				else if (answers_individualanswers[i][j].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][0][1] = Double.toString(l);
					l++;
				}
				else if (individualanswers_dimensions[i][1][0] == "0"){
					individualanswers_dimensions[i][1][0] = "0";
				}
				else{
					individualanswers_dimensions[i][0][2] = Double.toString(m);
					m++;
				}
			}
			percentbie[i][0] = (int) Math.round(((l-1)*100)/(k+l-2));
			if (l == k){
				personality2[i][0] = "X";
			}
			else if (percentbie[i][0] < 50){
				personality2[i][0] = "E";
			}
			else if (percentbie[i][0] > 50){
				personality2[i][0] = "I";
			}
			else {
				personality2[i][0] = "X";
			}
			for (int a = 1; a < 70; a+=7){ //finds the amounts of Sensing/iNtuition answers
				if (answers_individualanswers[i][a].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][1][0] = Double.toString(k2);
					k2++;
				}
				else if (answers_individualanswers[i][a].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][1][1] = Double.toString(l2);
					l2++;
				}
				else{
					individualanswers_dimensions[i][1][2] = Double.toString(m2);
					m2++;
				}
			}
			for (int a = 2; a < 70; a+=7){
				if (answers_individualanswers[i][a].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][1][0] = Double.toString(k2);
					k2++;
				}
				else if (answers_individualanswers[i][a].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][1][1] = Double.toString(l2);
					l2++;
				}
				else if (answers_individualanswers[i][a] == null){
					individualanswers_dimensions[i][1][0] = "0";
				}
				else{
					individualanswers_dimensions[i][1][2] = Double.toString(m2);
					m2++;
				}
			}
			percentbsn[i][0] = (int) Math.round(((l2-1)*100)/(l2+k2-2));
			if (l2 == k2){
				personality2[i][1] = "X";
			}
			else if (percentbsn[i][0] < 50){
				personality2[i][1] = "S";
			}
			else if (percentbsn[i][0] > 50){
				personality2[i][1] = "N";
			}else{
				personality2[i][1] = "X";
			}
		
			for (int b = 3; b < 70; b+=7){// Finds the amount of Thinking/Feeling answers
				if (answers_individualanswers[i][b].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][2][0] = Double.toString(k3);
					k3++;
				}
				else if (answers_individualanswers[i][b].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][2][1] = Double.toString(l3);
					l3++;
				}
				else if (individualanswers_dimensions[i][2][0] == null){
					individualanswers_dimensions[i][2][0] = "0";
				}
				else{
					individualanswers_dimensions[i][2][2] = Double.toString(m3);
					m3++;
				}
			}
			for (int b = 4; b < 70; b+=7){
				if (answers_individualanswers[i][b].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][2][0] = Double.toString(k3);
					k3++;
				}
				else if (answers_individualanswers[i][b].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][2][1] = Double.toString(l3);
					l3++;
				}
				else if (individualanswers_dimensions[i][2][0] == null){
					individualanswers_dimensions[i][1][0] = "0";
				}
				else{
					individualanswers_dimensions[i][2][2] = Double.toString(m3);
					m3++;
				}
			}
			percentbtf[i][0] = (int) Math.round(((l3-1)*100)/(l3+k3-2));
			if (l3 == k3){
				personality2[i][2] = "X";
			}
			else if (percentbtf[i][0] < 50){
				personality2[i][2] = "T";
			}
			else if (percentbtf[i][0] > 50){
				personality2[i][2] = "F";
			}
			else {
				personality2[i][2] = "X";
			}
			for (int c = 5; c < 70; c+=7){ // Finds the amount of Judging/Perceiving answers
				if (answers_individualanswers[i][c].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][3][0] = Double.toString(k4);
					k4++;
				}
				else if (answers_individualanswers[i][c].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][3][1] = Double.toString(l4);
					l4++;
				}
				else if (individualanswers_dimensions[i][3][0] == null){
					individualanswers_dimensions[i][1][0] = "0";
				}
				else{
					individualanswers_dimensions[i][3][2] = Double.toString(m4);
					m4++;
				}
			}
			for (int b = 6; b < 70; b+=7){
				if (answers_individualanswers[i][b].equalsIgnoreCase("a")){
					individualanswers_dimensions[i][3][0] = Double.toString(k4);
					k4++;
				}
				else if (answers_individualanswers[i][b].equalsIgnoreCase("b")){
					individualanswers_dimensions[i][3][1] = Double.toString(l4);
					l4++;
				}
				else if (individualanswers_dimensions[i][3][0] == null){
					individualanswers_dimensions[i][3][0] = "0";
				}
				else{
					individualanswers_dimensions[i][3][2] = Double.toString(m4);
					m4++;
				}
			}
			percentbjp[i][0] = (int) Math.round(((l4-1)*100)/(k4+l4-2));
			if (l4 == k4){
				personality2[i][3] = "X";
			}
			else if (percentbjp[i][0] < 50){
				personality2[i][3] = "J";
			}
			else if (percentbjp[i][0] > 50){
				personality2[i][3] = "P";
			}
			else{
				personality2[i][3] = "X";
			}
		}
	}	
}	