package amb.CalculateDivisors;

import java.util.ArrayList;

public class Divisor {
	
	private double number;
	
	public Divisor(double subject) {
		this.number = subject;
	}
	
	public void findDivisors(double number) {
		
		ArrayList<Integer> childPrimes = new ArrayList<Integer>();
		
		for(int i = 0; i < number; i++) {
			
		}
		
	}
	
	//Returns true if given double is a prime (Negative, 0 and 1 will return true until fixed)
	public boolean isPrime(double number) {
		
		double squareRoot = Math.sqrt(number);
		
		for(int i = 2; i <= squareRoot; i++) {
			if((number%i) == 0) {
				return false;
			}
		}
		return true;
		
	}
	

}
