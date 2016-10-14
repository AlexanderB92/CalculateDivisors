package amb.CalculateDivisors;

public class Divisor {
	
	private double number;
	
	public Divisor(double subject) {
		this.number = subject;
	}
	
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
