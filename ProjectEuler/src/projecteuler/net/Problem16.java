/*
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
package projecteuler.net;

import java.math.BigInteger;

/**
 *
 * @author w00kx
 */
public class Problem16 {
    
    private BigInteger base = BigInteger.ZERO;

    public BigInteger getBase() {
        return base;
    }

    public void setBase(BigInteger base) {
        this.base = base;
    }
    
    public Problem16() {
        base = new BigInteger("2");
    }
    
    public String getExpo(int value) { 
        BigInteger resp = BigInteger.ONE;
        for(int i = 0; i < value; i++) { 
            resp = getBase().multiply(resp);
        }
        return resp.toString();
    }
    
    public String getSumOfDigit(String number) {
        int length = number.length();
        Integer resp = 0;
        char strDigit; 
        for(int i = 0 ; i < length; i++) {
            strDigit = number.charAt(i);
            resp = resp +  strDigit-'0';
//            System.out.println(number + " number.charAt("+i+") : " + strDigit + 
//                    " .resp : " + resp);
        }
        return resp.toString(); 
    }
    
    public static void main(String[] args) {
        String resp;
        int exp = 1000;
        Problem16 problem16 = new Problem16();
        resp = problem16.getExpo(exp);
        System.out.println(" 2 ^ " + exp + " = " + resp);
        resp = problem16.getSumOfDigit(resp);
        System.out.println("sum of digits : " + resp);
    }
    
}
