package projecteuler.net;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w00kyx
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("projecteuler.net.Problem14.main() : ");
        
        Integer number = 0, count = 0,temp = 0;
        Problem14 problem14 = new Problem14();
        
        for(number = 2; number < 1000000; number++){
            count = problem14.longestChain(number);
            if(temp < count) {
                temp = count;
                System.out.println("number : " + number + " count : " + count);
            } 
        } //end for
        System.out.println(" the longest chain is  " + temp);

    }
    
    public boolean isOdd(long number) {
        return number%2 != 0;
    }
    
    public long getEven(long number) {
        return (number/2);
    }
    
    public long getOdd(long number) {
        return (3*number + 1);
    }
    
    public Integer longestChain(Integer number) {
        
        long tempNumber = number.longValue();
        
        Integer count = 1;
               
        while(tempNumber > 1) {
            if(isOdd(tempNumber)) tempNumber = getOdd(tempNumber);
            else tempNumber = getEven(tempNumber);
            count++; 
        }
        return count;
    }
}
