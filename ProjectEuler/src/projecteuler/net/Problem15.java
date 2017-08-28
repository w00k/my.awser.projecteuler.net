/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.net;

import java.math.BigInteger;

/**
 *
 * @author Francisco
 */
public class Problem15 {

    /**
    *
    * @author w00kyx
    * Get the factorial number ... 
    */
    public BigInteger factorial(int n) {
        if (n < 0) return BigInteger.ONE;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /**
    *
    *  @author w00kyx
    * This solution is base in a formule 
    */
    public BigInteger binomial(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ONE;
        BigInteger binominal = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            binominal = binominal.multiply(BigInteger.valueOf(n - i));
        }
        return binominal.divide(factorial(k));
    }

    public static void main(String[] args) {
        Problem15 problema15 = new Problem15();
        System.out.println("Problem 15 . binominal(40,20) : " + 
                problema15.binomial(40, 20).toString());

    }

}
