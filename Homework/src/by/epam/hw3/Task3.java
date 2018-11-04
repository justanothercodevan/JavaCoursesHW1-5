package by.epam.hw3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, h;
		double [] mas = null;
		/*
		a = readFromConsole("a");
		b = readFromConsole("b");
		h = readFromConsole("c");
		*/
		a=2;
		b=6;
		h=2;
		
		if(checkInput(a, b, h)) {
			mas = countTangenses(a, b, h, mas);
			printTable(a, h, mas);
			
		}		

	}
	
	public static int readFromConsole(String name){
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.printf("Введите %s: ", name);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.printf("Введите %s: ", name);
		}
		num = sc.nextInt();
		sc.close();
		return num;
	}
	
	public static boolean checkInput(int a, int b, int h) {
		boolean status = false;
		if (b < a) {
			System.out.println("b < a!!!");
		} else if (h == 0) {
			System.out.println("h equals 0!!!");
		} else {
			status = true;
		}
		return status;
	}
	
	public static double [] countTangenses(int a, int b, int h, double [] mas) {
		int size = (b - a) / h;
		System.out.println("Size: " + size);
		if (size != 0) {
			mas = new double[size];
			
			for (int i = 0; i < mas.length; i++) {
				mas [i] = 2 * Math.tan(a/2) + 1;
				a+=h;			
			}			
			return mas;
		} else {
			return new double[0];
		}
		
	}
	
	public static void printTable(int arg, int increment, double [] mas) {
		System.out.println("--------------------------------------------");
		System.out.println("Value\t||\tResult");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(arg + "\t||\t" + mas[i]);
			arg+=increment;
		}
		System.out.println("--------------------------------------------");
	}

}
