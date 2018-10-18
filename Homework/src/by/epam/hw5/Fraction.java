package by.epam.hw5;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction () {
		num = 0;
		den = 1;
		
	}
	
	public Fraction(int num, int den) {
		this.num=num;
		this.den=den;
		
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
}
