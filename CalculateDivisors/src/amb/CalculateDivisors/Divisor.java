package amb.CalculateDivisors;

import java.util.ArrayList;

public class Divisor {

	private double number;

	public Divisor(double subject) {
		this.number = subject;
	}

	public ArrayList<Double> findPrimeFactors(double n) {
		
		double number = n;
		ArrayList<Double> result = new ArrayList<Double>();

		while(number%2 == 0) {
			result.add(2.0);
			number = number / 2;
		}
		
		for(int i = 3; i <= Math.sqrt(number); i+=2) {
			while(number%i == 0) {
				result.add((double) i);
				number = number / i;
			}
		}
		
		if (number > 2) {
			result.add(n);
		}
		
		return result;

	}

	// Returns true if given double is a prime (Negative, 0 and 1 will return
	// true until fixed)
	public boolean isPrime(double number) {

		double squareRoot = Math.sqrt(number);

		for (int i = 2; i <= squareRoot; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;

	}

}
