package projecteuler.net;

public class Problem4 {
	
	/**
	 * URL: https://projecteuler.net/problem=4
	 * Largest palindrome product
	 * A palindromic number reads the same both ways. 
	 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * */

	public Problem4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Integer maxValue, minValue, auxValue;
		minValue = 100;
		
		auxValue = 0;
		maxValue = 0;
		
		Problem4 palindrome = new Problem4();
		
		for(int firstNumber = 999; firstNumber > minValue; firstNumber--) {
			for(int secondNumber = 999; secondNumber > minValue; secondNumber--) {
				
				auxValue = firstNumber * secondNumber ;
				
				if(palindrome.isPalindrome(auxValue)) {

					if(maxValue < auxValue) {
						maxValue = auxValue;
						System.out.println("Max maxValue : " + maxValue);
					}

				}
				
			} //end second for
		} //end first for 
		
		System.out.println("The last palindrome is " + maxValue );
		
	}
	
	public boolean isPalindrome(Integer number) {
		
		boolean result = false;
		String reverse = null;
		
		reverse = pivot( number);
		
		if(number.toString().compareTo(reverse) == 0) {
			result = true;
		}
		
		return result; 
	}
	
	public String pivot(Integer number) { 
		
		String str = new StringBuffer(number.toString()).reverse().toString();;
		
		return str;
	}

}
