package by.epam.hw4;

import java.util.Random;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = new int[10];
		
		enterArrayWithRandom(mas, 300);
		
		printArray(mas);
		
		int[] mas0 = new int [new Random().nextInt(5)+1];
		enterArrayWithRandom(mas0, mas.length);
		printArray(mas0);
		
		for (int i=0; i < mas0.length; i++) {
			int index0 = mas0[i];
			mas[index0] = 0;
			
		}
		
		printArray(mas);
		

	}
	
	public static void enterArrayWithRandom(int[] mas, int limit) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}
	
	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}
	
}
