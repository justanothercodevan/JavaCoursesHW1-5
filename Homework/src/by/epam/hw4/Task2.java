package by.epam.hw4;

import java.util.Random;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = new int [10];
		enterIncreasingSequence(mas);
		ArrayExample.printArray(mas);
		checkIncrOrDecr(mas);
		enterDecreasingSequence(mas);
		ArrayExample.printArray(mas);
		checkIncrOrDecr(mas);
		
	}
	
	
	public static void enterIncreasingSequence(int[] mas) {
		Random rand = new Random();
		int init = 0;
		int limit = 10;
		int limitMultiplier = 2;
		for (int i = 0; i < mas.length; i++) {
			int randValue;
			do {
				randValue = rand.nextInt(limit);
			} while (randValue < init);
			
			mas[i] = randValue;
			init = randValue;
			limit=limit*limitMultiplier;
		}
	}
	
	public static void enterDecreasingSequence (int [] massive) {
		enterIncreasingSequence(massive);
		for (int i = 0; i < massive.length / 2; i++) {
	        int tmp = massive[i];
	        massive[i] = massive[massive.length - i - 1];
	        massive[massive.length - i - 1] = tmp;			
		}
		
	}
	
	public static void checkIncrOrDecr(int [] mas) {
		if (mas[1] > mas[0]) {
			System.out.println("Sequence is ascending");
			
		} else {
			System.out.println("Sequence is descending");
		}
		
	}

}

	
