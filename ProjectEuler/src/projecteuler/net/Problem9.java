package projecteuler.net;

public class Problem9 {

	public Problem9() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a2 + b2 = c2
	 * For example, 3exp2 + 4exp2 = 9 + 16 = 25 = 5exp2.
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem9 problem9 = new Problem9();
		
		Integer a, b, c; 
		
		for(c = 1000; c > 3; c--) {
			for(b=(c-1); b > 2; b--) {
				for(a=(b-1); a > 1; a--) {
					
					if(problem9.isOneThousand(a, b, c) && problem9.isPythagorean(a, b, c)){
						System.out.println("a : " + a + "\nb : " + b + "\nc : " + c);
						System.out.println("a*b*c = " + (a*b*c));
					}
					
				} //end decrease c
			} //end decrease b
		} //end decrease a

	}
	
	public boolean isPythagorean(Integer a, Integer b, Integer c) {
		boolean isPythagorean = false; 
		Integer auxA, auxB, auxC;
		
		if(a != b && b != c) {
			
			auxA = a * a;
			auxB = b * b;
			auxC = c * c;
			
			if((auxA + auxB) == auxC) {
				isPythagorean = true;
			}
		}
		
		return isPythagorean;
	}
	
	public boolean isOneThousand(Integer a, Integer b, Integer c) {
		boolean oneThousand = false; 
		Integer auxA, auxB, auxC;
		
		if(a != b && b != c) {
			
			auxA =  a;
			auxB = b;
			auxC = c;
			
			if((auxA + auxB + auxC) == 1000) {
				oneThousand = true;
			}
		}
		
		return oneThousand;
	}
	
	public boolean isOrdered(Integer a, Integer b, Integer c) {
		boolean isOrder = false; 
		
		if(a != b && b != c) {
			
			if(a < b && b < c) {
				isOrder = true;
			}
		}
		
		return isOrder;
	}

}
