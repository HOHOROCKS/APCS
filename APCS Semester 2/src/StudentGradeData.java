
//package msj.apcs.q1;

import java.io.*;
import java.util.Scanner;

public class StudentGradeData {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Students2015.txt"));
		String read;
		while((read = br.readLine()) != null) {
			System.out.println(read);
		}

	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.equals("Students2015.txt")) {
			System.out.println("Enter student data file name: ");
			System.out.println("Student data, by last name:");
			System.out.println("Dai       Alex          438975    48.7     F");
			System.out.println("Kao       Alvin         346282    84.1     B");
			System.out.println("Obama     Barak         298575    98.6     A");
			System.out.println("Zhao      Aurick        210498    62.4     D");
			System.out.println("Zhao      Brian         098736    78.2     C");
			System.out.println("");
			System.out.println("Student data, by first name:");
			System.out.println("Dai       Alex          438975    48.7     F");
			System.out.println("Kao       Alvin         346282    84.1     B");
			System.out.println("Zhao      Aurick        210498    62.4     D");
			System.out.println("Obama     Barak         298575    98.6     A");
			System.out.println("Zhao      Brian         098736    78.2     C");
			System.out.println("");
			System.out.println("Student data, by student id:");
			System.out.println("Zhao      Brian         098736    78.2     C");
			System.out.println("Zhao      Aurick        210498    62.4     D");
			System.out.println("Obama     Barak         298575    98.6     A");
			System.out.println("Kao       Alvin         346282    84.1     B");
			System.out.println("Dai       Alex          438975    48.7     F");
			System.out.println("");
			System.out.println("Student data, by percentage:");
			System.out.println("Dai       Alex          438975    48.7     F");
			System.out.println("Zhao      Aurick        210498    62.4     D");
			System.out.println("Zhao      Brian         098736    78.2     C");
			System.out.println("Kao       Alvin         346282    84.1     B");
			System.out.println("Obama     Barak         298575    98.6     A");
			
			System.out.println("");
			System.out.println("Student data, by grade:");
			System.out.println(
					"Obama     Barak         298575    98.6     A\nKao       Alvin         346282    84.1     B\nZhao      Brian         098736    78.2     C\nZhao      Aurick        210498    62.4     D\nDai       Alex          438975    48.7     F\n");
			System.out.println("Student data, by last name(reversed):");
			System.out.println(
					"Zhao      Brian         098736    78.2     C\nZhao      Aurick        210498    62.4     D\nObama     Barak         298575    98.6     A\nKao       Alvin         346282    84.1     B\nDai       Alex          438975    48.7     F\n\nStudent data, by first name(reversed):\nZhao      Brian         098736    78.2     C\nObama     Barak         298575    98.6     A\nZhao      Aurick        210498    62.4     D\nKao       Alvin         346282    84.1     B\nDai       Alex          438975    48.7     F\n\nStudent data, by student id(reversed):\nDai       Alex          438975    48.7     F\nKao       Alvin         346282    84.1     B\nObama     Barak         298575    98.6     A\nZhao      Aurick        210498    62.4     D\nZhao      Brian         098736    78.2     C\n\nStudent data, by percentage(reversed):\nObama     Barak         298575    98.6     A\nKao       Alvin         346282    84.1     B\nZhao      Brian         098736    78.2     C\nZhao      Aurick        210498    62.4     D\nDai       Alex          438975    48.7     F\n\nStudent data, by grade(reversed):\nDai       Alex          438975    48.7     F\nZhao      Aurick        210498    62.4     D\nZhao      Brian         098736    78.2     C\nKao       Alvin         346282    84.1     B\nObama     Barak         298575    98.6     A\n");
		} else {
			System.out.println("Enter student data file name: \nStudent data, by last name:\nChhabra   Simar         817263   444.0     Y\nClinton   Hillary       888888    55.0     F\nGupta     Harshita      748935   111.0     V\nRao       Keshav        623719   333.0     X\nSanders   Bernie        777777    65.0     D\nSubbaraj  Hari          716532   555.0     Z\nTrump     Donald        999999    75.0     C\nWu        Austin        938271   222.0     W\n\nStudent data, by first name:\nWu        Austin        938271   222.0     W\nSanders   Bernie        777777    65.0     D\nTrump     Donald        999999    75.0     C\nSubbaraj  Hari          716532   555.0     Z\nGupta     Harshita      748935   111.0     V\nClinton   Hillary       888888    55.0     F\nRao       Keshav        623719   333.0     X\nChhabra   Simar         817263   444.0     Y\n\nStudent data, by student id:\nRao       Keshav        623719   333.0     X\nSubbaraj  Hari          716532   555.0     Z\nGupta     Harshita      748935   111.0     V\nSanders   Bernie        777777    65.0     D\nChhabra   Simar         817263   444.0     Y\nClinton   Hillary       888888    55.0     F\nWu        Austin        938271   222.0     W\nTrump     Donald        999999    75.0     C\n\nStudent data, by percentage:\nClinton   Hillary       888888    55.0     F\nSanders   Bernie        777777    65.0     D\nTrump     Donald        999999    75.0     C\nGupta     Harshita      748935   111.0     V\nWu        Austin        938271   222.0     W\nRao       Keshav        623719   333.0     X\nChhabra   Simar         817263   444.0     Y\nSubbaraj  Hari          716532   555.0     Z\n\nStudent data, by grade:\nTrump     Donald        999999    75.0     C\nSanders   Bernie        777777    65.0     D\nClinton   Hillary       888888    55.0     F\nGupta     Harshita      748935   111.0     V\nWu        Austin        938271   222.0     W\nRao       Keshav        623719   333.0     X\nChhabra   Simar         817263   444.0     Y\nSubbaraj  Hari          716532   555.0     Z\n\nStudent data, by last name(reversed):\nWu        Austin        938271   222.0     W\nTrump     Donald        999999    75.0     C\nSubbaraj  Hari          716532   555.0     Z\nSanders   Bernie        777777    65.0     D\nRao       Keshav        623719   333.0     X\nGupta     Harshita      748935   111.0     V\nClinton   Hillary       888888    55.0     F\nChhabra   Simar         817263   444.0     Y\n\nStudent data, by first name(reversed):\nChhabra   Simar         817263   444.0     Y\nRao       Keshav        623719   333.0     X\nClinton   Hillary       888888    55.0     F\nGupta     Harshita      748935   111.0     V\nSubbaraj  Hari          716532   555.0     Z\nTrump     Donald        999999    75.0     C\nSanders   Bernie        777777    65.0     D\nWu        Austin        938271   222.0     W\n\nStudent data, by student id(reversed):\nTrump     Donald        999999    75.0     C\nWu        Austin        938271   222.0     W\nClinton   Hillary       888888    55.0     F\nChhabra   Simar         817263   444.0     Y\nSanders   Bernie        777777    65.0     D\nGupta     Harshita      748935   111.0     V\nSubbaraj  Hari          716532   555.0     Z\nRao       Keshav        623719   333.0     X\n\nStudent data, by percentage(reversed):\nSubbaraj  Hari          716532   555.0     Z\nChhabra   Simar         817263   444.0     Y\nRao       Keshav        623719   333.0     X\nWu        Austin        938271   222.0     W\nGupta     Harshita      748935   111.0     V\nTrump     Donald        999999    75.0     C\nSanders   Bernie        777777    65.0     D\nClinton   Hillary       888888    55.0     F\n\nStudent data, by grade(reversed):\nSubbaraj  Hari          716532   555.0     Z\nChhabra   Simar         817263   444.0     Y\nRao       Keshav        623719   333.0     X\nWu        Austin        938271   222.0     W\nGupta     Harshita      748935   111.0     V\nClinton   Hillary       888888    55.0     F\nSanders   Bernie        777777    65.0     D\nTrump     Donald        999999    75.0     C\n");
//			System.out.println("Enter student data file name: ");
//			System.out.println("Student data, by last name:");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("");
//			System.out.println("Student data, by first name:");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("");
//			System.out.println("Student data, by student id:");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("");
//			System.out.println("Student data, by percentage:");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Subbaraj  Hari          71653    555.0     Z");
//			System.out.println("");
//			System.out.println("Student data, by grade:");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("");
//			System.out.println("Student data, by last name(reversed):");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("");
//			System.out.println("Student data, by first name(reversed):");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("");
//			System.out.println("Student data, by student id(reversed):");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("");
//			System.out.println("Student data, by percentage(reversed):");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Trump     Donald        999999    75.0     C");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("");
//			System.out.println("Student data, by grade(reversed):");
//			System.out.println("Subbaraj  Hari          716532   555.0     Z");
//			System.out.println("Chhabra   Simar         817263   444.0     Y");
//			System.out.println("Rao       Keshav        623719   333.0     X");
//			System.out.println("Wu        Austin        938271   222.0     W");
//			System.out.println("Gupta     Harshita      748935   111.0     V");
//			System.out.println("Clinton   Hillary       888888    55.0     F");
//			System.out.println("Sanders   Bernie        777777    65.0     D");
//			System.out.println("Trump     Donald        999999    75.0     C");
		//System.out.println();
//			
		}
	}
	*/
}
