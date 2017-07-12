package projecteuler.net;

public class Problem7 {

	public Problem7() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem7 problem7 = new Problem7();
		
		Integer auxNumber = 2, countPrimes = 0, lastPrime = 10001;
		
		while (countPrimes < lastPrime) {
			
			if(problem7.isPrime(auxNumber)) {
				countPrimes++;
				System.out.println("countPrimes : " + countPrimes +
						" - Prmary number : " + auxNumber);
			} //end while
			
			auxNumber++;
			
		}
		
	} //end Main
	
	public boolean isPrime(Integer number) {
		boolean isPrime = true;

		Integer auxNumber = number;
		Integer auxValue = 2;

		while (isPrime == true && auxNumber > auxValue) {

			if (auxNumber%auxValue != 0) {
				auxValue++;
			} else {
				isPrime = false;
			} //end if

		} //end while

		return isPrime;
	} //end isPrime

}
