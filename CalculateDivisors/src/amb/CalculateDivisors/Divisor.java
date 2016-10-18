package amb.CalculateDivisors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Divisor {

	private double number;

	public Divisor(double subject) {
		if (subject == 0) {
			System.out.println("WARNING: 0 has no divisors - Terminating program...");
			System.exit(0);
		}
		this.number = subject;
	}

	/**
	 * Iterates through map, that shows frequency of prime factors. The
	 * frequency of the prime factors can be expressed as exponents. These are
	 * fed into the following mathematical formula: d(n) = (a+1)(b+1)(c+1)...
	 * where d(n) is the number of divisors for n, and a, b, c.. are the
	 * exponents of the frequency of the prime factors. (example: 2, 2, 5, 5
	 * becomes 2^2 * 5^2, which becomes (2+1)*(2+1)
	 * 
	 * @return The total number of divisors of the subject of the class of type
	 *         int.
	 */
	public int numberOfDivisors() {

		int result = 0;

		Map<Double, Integer> frequencyMap = createFrequencyMap();

		for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
			if (result == 0) {
				result = entry.getValue() + 1;
			} else {
				result = result * (entry.getValue() + 1);
			}
		}

		return result;

	}

	/**
	 * Converts the ArrayList of Prime factors of type double into a map, where
	 * duplicate values become keys, and the frequency of the duplicates become
	 * the values.
	 * 
	 * @return a map of keyset containing prime factors, and the frequencies of
	 *         these expressed as the values.
	 */
	public Map<Double, Integer> createFrequencyMap() {

		ArrayList<Double> primeFactors = findPrimeFactors();

		Map<Double, Integer> frequencyMap = new HashMap<Double, Integer>();

		for (Double n : primeFactors) {
			Integer freq = frequencyMap.get(n);

			if (freq == null) {
				frequencyMap.put(n, 1);
			} else {
				frequencyMap.put(n, freq += 1);
			}
		}

		return frequencyMap;

	}

	/**
	 * The objective of this method is to find a set of prime factors that can
	 * be multiplicated to yield the subject number The first check is for the
	 * occurrence of 2, which is a prime number, by dividing by 2 till it can't
	 * be done without remainder. Then a for-loop checks possible divisions of
	 * primes by starting from 3 and adding 2 at each iteration with the square
	 * root of the number being the limit. This is because the smallest prime
	 * factor of a composite (non-prime, not 1) number is always <sqrt(number).
	 * The last step adds the number itself.
	 * 
	 * @return ArrayList of prime factorization of the subject number
	 */
	public ArrayList<Double> findPrimeFactors() {

		double number = this.number;
		ArrayList<Double> result = new ArrayList<Double>();

		while (number % 2 == 0) {
			result.add(2.0);
			number = number / 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				result.add((double) i);
				number = number / i;
			}
		}

		if (number > 2) {
			result.add(number);
		}

		return result;

	}

	/**
	 * Checks if a given number is a prime by checking that number is only
	 * divisible by 1 and itself
	 * 
	 * @param number
	 *            of type double
	 * @return boolean(true) if number is a prime, (false) if number is not a
	 *         prime.
	 */
	public boolean isPrime(double number) {

		double squareRoot = Math.sqrt(number);

		for (int i = 2; i <= squareRoot; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;

		// Returns true if given double is a prime (Negative, 0 and 1 will
		// return
		// true until fixed)
	}

}
