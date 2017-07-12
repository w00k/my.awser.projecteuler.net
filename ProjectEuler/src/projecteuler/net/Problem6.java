package projecteuler.net;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

	public Problem6() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The sum of the squares of the first ten natural numbers is, 1exp2 + 2exp2
	 * + ... + 10exp2 = 385 The square of the sum of the first ten natural
	 * numbers is, (1 + 2 + ... + 10)exp2 = 552 = 3025 Hence the difference
	 * between the sum of the squares of the first ten natural numbers and the
	 * square of the sum is 3025 − 385 = 2640. Find the difference between the
	 * sum of the squares of the first one hundred natural numbers and the
	 * square of the sum.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem6 problem6 = new Problem6();
		
		List<Integer> numbers = problem6.getNumber(100);
		
		Integer sumExp = 0, sumNumber = 0;
		
		for (Integer num : numbers) {
			
			sumExp = sumExp + problem6.expTwo(num);
			
			sumNumber = sumNumber + num;
		}
		
		sumNumber = problem6.expTwo(sumNumber);
		
		System.out.println("sumExp :  " + sumExp);
		
		System.out.println("sumNumber exp 2 : " + sumNumber);
		
		System.out.println("result: " + (sumNumber - sumExp));
	}

	public List<Integer> getNumber(Integer maxNumber) {

		List<Integer> numbers = new ArrayList<Integer>();

		for (Integer i = 1; i <= maxNumber; i++) {
			numbers.add(i);
		}

		return numbers;
	} // end getNumber
	
	public Integer expTwo(Integer number){
		return number * number;
	}

}
