package projecteuler.net;

import java.math.BigInteger;

/*

The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

*/

public class Problem25 {

	public static void main(String[] args) {
		
		Problem25 problem = new Problem25();
		Integer index = 1;
		BigInteger value =  BigInteger.ZERO;
		Integer length = index.toString().length();
		System.out.println("start ... ");
//4782
		while(length < 1000) { 
			value = problem.fibonacci(index) ; 
			length = value.toString().length(); 
			System.out.println("value : " + value + ", index : " + index + ", length : " + length);
			index++;
		}
		System.out.println("index : " + (index-1) + " ---> " + value + ", length : " + length);
		
		System.out.println("end ... ");
		
	}
	
	public BigInteger fibonacci(Integer index) {
		BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c; 
        if (index == a.intValue()) {
        	return a; 
        }
        for (Integer i = 2; i <= index ; i++) { 
            c = a.add(b); 
            a = b; 
            b = c;
        } 
        return b; 
	}

}
