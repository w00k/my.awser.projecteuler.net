package projecteuler.net;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem3 {

	public Problem3() {
		super();
	}

	/**
	 * Problem 3.
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */

	public static void main(String args[]) {

		Problem3 primeFactors = new Problem3();
		List<BigInteger> listFactors;
		BigInteger number = new BigInteger("600851475143");
		BigInteger factor;
		listFactors = primeFactors.findTop(number);
		Iterator<BigInteger> it = listFactors.iterator();

		while (it.hasNext()) {
			factor = (BigInteger) it.next();
			System.out.println("factor " + factor + " is Prime?  " + primeFactors.isPrime(factor));
		} // end while

	}

	public List<BigInteger> findTop(BigInteger number) {

		boolean flagRetry = true;

		List<BigInteger> listFactors = new ArrayList<BigInteger>();
		BigInteger bigIntegerAuxValue = new BigInteger("2");
		BigInteger auxNumber = number;
		BigInteger bigIntegerNumberZero = new BigInteger("0");
		BigInteger bigIntegerNumberOne = new BigInteger("1");

		while (auxNumber.compareTo(bigIntegerAuxValue) > 0) {

			if (auxNumber.mod(bigIntegerAuxValue).equals(bigIntegerNumberZero) && flagRetry) {
				listFactors.add(bigIntegerAuxValue);
				auxNumber = auxNumber.divide(bigIntegerAuxValue);
				System.out.println("add to list : " + bigIntegerAuxValue);
				flagRetry = false;
			}

			if (auxNumber.mod(bigIntegerAuxValue).equals(bigIntegerNumberZero) && !flagRetry) {
				auxNumber = auxNumber.divide(bigIntegerAuxValue);
				System.out.println("mod : " + auxNumber.mod(bigIntegerAuxValue).equals(bigIntegerNumberZero)
						+ " flagRetry : " + flagRetry
						+ " auxNumber : " + auxNumber
						+ " bigIntegerAuxValue : " + bigIntegerAuxValue);
			} else {
				flagRetry = true;
				bigIntegerAuxValue = bigIntegerAuxValue.add(bigIntegerNumberOne);

				// System.out.println("bigIntegerAuxValue : " +
				// bigIntegerAuxValue );

			}

		} // end while

		listFactors.add(auxNumber); // add the last number in the list

		return listFactors;

	} // end findTop

	public boolean isPrime(BigInteger number) {
		boolean isPrime = true;

		BigInteger auxNumber = number;
		BigInteger bigIntegerNumberZero = new BigInteger("0");
		BigInteger bigIntegerNumberOne = new BigInteger("1");
		BigInteger bigIntegerAuxValue = new BigInteger("2");

		while (isPrime == true && auxNumber.compareTo(bigIntegerAuxValue) > 0 && isPrime) {

			if (auxNumber.mod(bigIntegerAuxValue).equals(bigIntegerNumberZero) == false) {
				bigIntegerAuxValue = bigIntegerAuxValue.add(bigIntegerNumberOne);
				// System.out.println("bigIntegerAuxValue +1 : " +
				// bigIntegerAuxValue );

			} else {
				isPrime = false;
			}

		}

		return isPrime;

	}

}