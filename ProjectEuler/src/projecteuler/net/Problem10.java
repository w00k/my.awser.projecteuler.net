package projecteuler.net;

import java.math.BigInteger;

public class Problem10 {

	public Problem10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem10 problem10 = new Problem10();
		BigInteger sumPrime = new BigInteger("0");
//		BigInteger auxPrime = new BigInteger("0");
		boolean isNumberPrime = false;
		Integer maxValue = 2000000;

		for(Integer i = 2; i < maxValue; i++) {
			//isNumberPrime = problem10.isPrime(i);
			isNumberPrime = problem10.isProbable(new BigInteger(i.toString()));
			
			if(isNumberPrime) {
				sumPrime = sumPrime.add(new BigInteger(i.toString()) );
				//System.out.println("isPrime : " + i + " - sumPrime : " + sumPrime);
			}			
		}
		// the result is 142913828922, number 1 is not considera
		System.out.println("The sum of all the primes below two million is : " + sumPrime);
		
	}

	public boolean isPrime(Integer number) {
		Integer auxNumber = number;
		Integer auxValue = 2;
		Integer middleAuxNumber = number/2;
		
		if(auxNumber!= 2 && auxNumber%2 == 0) return false;
		
		while (middleAuxNumber > auxValue) {

			if (auxNumber%auxValue == 0) return false;
			
			auxValue++;
		}
		return true;
	} //end isPrime
	
	//implement of isProbablePrime natiev for Java
	public boolean isProbable(BigInteger number) {
		int certainty = 1000;
		return number.isProbablePrime(certainty );
	}
	
}

	
