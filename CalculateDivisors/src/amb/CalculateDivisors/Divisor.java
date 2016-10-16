package amb.CalculateDivisors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Divisor {

	private double number;

	public Divisor(double subject) {
		if(subject == 0) {
			System.out.println("WARNING: 0 has no divisors - Proceed with caution");
		}
		this.number = subject;
	}
	
	public int numberOfDivisors() {
		
		int result = 0;
		
		Map<Double, Integer> frequencyMap = createFrequencyMap();
		
		for(Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
			if(result == 0) {
				result = entry.getValue() + 1;
			}
			else {
				result = result * (entry.getValue() + 1);
			}
		}
		
		return result;
			
	}
	
	public Map<Double, Integer> createFrequencyMap() {
		
		ArrayList<Double> primeFactors = findPrimeFactors();
		
		Map<Double, Integer> frequencyMap = new HashMap<Double, Integer>();
		
		for(Double n : primeFactors) {
			Integer freq = frequencyMap.get(n);
			
			if(freq == null) {
				frequencyMap.put(n, 1);
			}
			else {
				frequencyMap.put(n, freq += 1);
			}
		}
		
		return frequencyMap;
			
	}

	public ArrayList<Double> findPrimeFactors() {
		
		double number = this.number;
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
			result.add(number);
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
