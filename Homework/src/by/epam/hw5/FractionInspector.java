package by.epam.hw5;

public class FractionInspector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac = new Fraction(1,2);
		
		System.out.println(frac.getNum());
		System.out.println(frac.getDen());
		
		int [] mas = new int [5];
		
		Fraction[] mas2 = new Fraction[5];
		
		System.out.println(mas2[0]);
		
		mas2[0] = new Fraction (1,3);
		
		System.out.println(mas2[0]);
		
	}

}
