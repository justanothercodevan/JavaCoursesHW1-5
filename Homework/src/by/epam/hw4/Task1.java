package by.epam.hw4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mas = new int [10];
		
		ArrayExample.enterArrayWithRandom(mas, 300);
		ArrayExample.printArray(mas);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any number");
		int k = sc.nextInt();
		
		int sum = 0;
		
		String check ="";
		
		for (int i:mas) {
			if (i % k == 0) {
				sum+=i;
				check+=i + " ";
			}
			
		}
		System.out.println("Sum of values multiple of " + k + ": " + sum);
		System.out.println("Values are: " + check);
		
		sc.close();
		
	}

}
