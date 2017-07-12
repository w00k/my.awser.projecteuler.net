package projecteuler.net;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem5 {

	private static final String Integer = null;

	public Problem5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem5 problem5 = new Problem5();

		List<Integer> values = problem5.getNumber(20);
		Integer numbersPrime = 1, numberComplex = 1;
		
//		System.out.println("9 : " + problem5.getBase(16));
		
		for (Integer i : values) {
			
			System.out.println(" i : " + i);
			
			if(problem5.isPrime(i)) {
				numbersPrime = numbersPrime * i;
			} else { 
				numberComplex = numberComplex * problem5.getBase(i);
				System.out.println(i + " - base " + problem5.getBase(i));
			}
			
		} //end for
		
		System.out.println("numbersPrime : " + numbersPrime 
				+ " - numberComplex :" + numberComplex);
		
		System.out.println(" Result : " + numbersPrime * numberComplex);
		
	} //Main
	
	public List<Integer> getNumber(Integer maxNumber) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(Integer i = 1; i <= maxNumber; i++){
			numbers.add(i);
		}
		
		return numbers; 
	} //end getNumber
	
	public boolean isPrime(Integer number) {
		boolean isPrime = true;

		Integer auxNumber = number;
		Integer auxValue = 2;

		while (isPrime == true && auxNumber > auxValue) {

			if (auxNumber%auxValue != 0) {
				auxValue++;
			} else {
				isPrime = false;
			}

		}

		return isPrime;
	} //end isPrime

	public Integer getBase(Integer number){
		Integer base, exp = 1, auxNumber = 1;
		boolean equal = false;
		
		if(number == 0) return 1;
			
		for(base = 2; base < number && !equal; base++){
			auxNumber = 1;
			for(exp = 1; auxNumber < number && !equal; exp++){
				
				auxNumber = base * auxNumber;
				
				System.out.println("base : " + base + " - exp : " + exp 
					+ " - auxNumber : " + auxNumber + " - number : " + number);
				
				if(auxNumber == number) {
					equal = true;
					auxNumber = base;
				} // end if
			} //for exp
			
		} //end base
		
		System.out.println("base : " + base + " - exp : " + exp 
				+ " - auxNumber : " + auxNumber + " - number : " + number);
		
		if(auxNumber == 0 || base == number) auxNumber = 1 ;
		
		return auxNumber;
	}

}
