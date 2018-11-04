package by.epam.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите r:");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		r = sc.nextDouble();
		
		
		double circleLength = 2 * Math.PI * r;
		System.out.println(circleLength);
		
		double circleSquare = Math.PI * Math.pow(r, 2);
		System.out.println(circleSquare);
		
		
	}

}
