package amb.CalculateDivisors;

import java.util.ArrayList;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Divisor d = new Divisor(455);
		
//		ArrayList<Double> test = d.findPrimeFactors();
//		
//		for(Double n : test) {
//			System.out.println(n);
//		}
//		
//		Map<Double, Integer> test2 = d.createFrequencyMap();
//		
//		for(Map.Entry<Double, Integer> entry : test2.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		System.out.println(d.numberOfDivisors());
		
		
	}

}
