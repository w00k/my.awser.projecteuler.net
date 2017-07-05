package projecteuler.net;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem1 {

	/**
	 * URL: https://projecteuler.net/problem=1
	 * Multiples of 3 and 5
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * result : 233168
	 * */
	
	public static void main(String[] args) {
		
		int[] numbers = {3,5};
		ArrayList lessNumber = new ArrayList();
		int finalIndex = 1000;
		Integer result = 0;
		Integer lessResult = 0;
		
		if(numbers.length > 1){
			for(int i = 0; i < numbers.length; i++) {
				for(int j = 0; j < i; j++) {
					lessNumber.add( numbers[j] * numbers[i]);
					System.out.println("lessNumber " + numbers[j] * numbers[i]);
				}
			}
		} 
		
		for(int i = 0; i < numbers.length; i++) {
			result = result + sumMultiples(numbers[i], finalIndex);
		}
		
		System.out.print(" result : " + result + " ... ");
		
		Iterator it = lessNumber.iterator();
		while(it.hasNext()) {
			lessResult = lessResult + sumMultiples((int) it.next(), finalIndex);
		}
		
		System.out.println("less " + lessResult);
		
		//result = sumMultiples(numbers[0],finalIndex) + sumMultiples(numbers[1],finalIndex) - sumMultiples(15,finalIndex);
		
		System.out.println(" Final result : " + (result - lessResult) );
		
	}
	
	private static Integer sumMultiples(int initialIndex, int finalIndex) {
		
		Integer result = 0;
		
		for(int i = initialIndex; i < finalIndex; i=i+initialIndex) {
			result = result + i;
			//System.out.println(i);
		}
		
		return result;
	}
	
}
