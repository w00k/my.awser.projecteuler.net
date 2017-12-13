/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.net;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 */
public class Problem20 {

    public String factorial(Integer number) {
        Integer aux = number; 
        BigInteger result = BigInteger.ONE;
        BigInteger auxResult = BigInteger.ONE;
        try {
            while(aux > 1) {
                auxResult = new BigInteger(aux.toString());
                result = result.multiply(auxResult);
                aux--;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public void strSumNumbers(String str) {
        System.out.println(str);
        int index = 0;
        Integer resultStrSum = 0;
        while(index < str.length()) {
            if(str.charAt(index) != '0'){
                resultStrSum = resultStrSum + Integer.parseInt(""+str.charAt(index));
            } 
            index++;
        }
        System.out.println("Result : " + resultStrSum);
    }
    
    public static void main(String[] args) {
        Problem20 problem = new Problem20();
        String str = "";
        str = problem.factorial(100);
        problem.strSumNumbers(str);
    }
    
}
