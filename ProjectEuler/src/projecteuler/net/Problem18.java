package projecteuler.net;

public class Problem18 {
	
	private String[][] triangle ;
	
	public String[][] getTriangle() {
		return triangle;
	}

	public void setTriangle(String[][] triangle) {
		this.triangle = triangle;
	}

	
	
	public Problem18() {
		
		String triangleTemp[][] = {
				{"75", null},
				{"95","64", null},
				{"17","47","82", null},
				{"18","35","87","10", null},
				{"20","04","82","47","65", null},
				{"19","01","23","75","03","34", null},
				{"88","02","77","73","07","63","67", null},
				{"99","65","04","28","06","16","70","92", null},
				{"41","41","26","56","83","40","80","70","33", null},
				{"41","48","72","33","47","32","37","16","94","29", null},
				{"53","71","44","65","25","43","91","52","97","51","14", null},
				{"70","11","33","28","77","73","17","78","39","68","17","57", null},
				{"91","71","52","38","17","14","91","43","58","50","27","29","48", null},
				{"63","66","04","68","89","53","67","30","73","16","69","87","40","31", null},
				{"04","62","98","27","23","09","70","98","73","93","38","53","60","04","23", null}
		} ;
		this.triangle = triangleTemp;
	}
	
	public void getRoute() { 
		
		int x,y, tempX = 0;
		for(y = 0; y < triangle.length; y++) { 
			for (x = tempX; triangle[y][x] != null; x++ ) { 
				System.out.print(triangle[y][x] + " ");
			}
			System.out.println(".");
		}
	
	}
	
	public boolean isNextValue(int y, int x) {
		String numberOne, numberTwo;
		boolean flag = false;
		try {
			numberOne = triangle[y+1][x];
			numberTwo = triangle[y+1][x+1];
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
	
	public int getValue(int y, int x) {
		int resp = 0, numberOne, numberTwo;
		try {
			if(isNextValue(y, x)) {
				numberOne = Integer.parseInt(triangle[y+1][x]);
				numberTwo = Integer.parseInt(triangle[y+1][x+1]);
				
				if(numberOne < numberTwo) {
					resp = numberTwo;
				} else {
					resp = numberOne;
				}
				
			} else {
				return resp;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resp;
	}
	
	public void getSum() { 
		
		int x = 0,y, tempNumberPositionOne, tempNumberPositionTwo; 
		Integer number = Integer.parseInt(triangle[0][0]) ;
		
		System.out.print(number + " ");
		for (y = 0; y < triangle.length; y++) {

			if (triangle[y][x + 1] != null) {
				tempNumberPositionTwo = Integer.parseInt(triangle[y][x + 1]) ;
				tempNumberPositionOne = Integer.parseInt(triangle[y][x]);

				if ((tempNumberPositionOne +  getValue(y, x)) < (tempNumberPositionTwo + getValue(y, x+1))) {
					x = x + 1;
					System.out.print(tempNumberPositionTwo + " ");
					number = number + tempNumberPositionTwo;
				} else {
					System.out.print(tempNumberPositionOne + " ");
					number = number + tempNumberPositionOne;
				}

			} //end if 

			System.out.println(".") ; 
		} //end for 
		
		System.out.println("value : " + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem18 problem18 = new Problem18();
		
		problem18.getRoute();
		System.out.println("Result of elements : ");
		problem18.getSum();
		
	}

}
