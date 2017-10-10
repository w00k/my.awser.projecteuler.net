package projecteuler.net;

public class Problem17 {

	private String[][] listNumbers;
	

	public String[][] getListNumbers() {
		return listNumbers;
	}

	public void setListNumbers(String[][] listNumbers) {
		this.listNumbers = listNumbers;
	}

	public Problem17() {
		String[][] listNumbers = { { "1", "one" }, { "2", "two" }, { "3", "three" }, { "4", "four" }, { "5", "five" },
				{ "6", "six" }, { "7", "seven" }, { "8", "eight" }, { "9", "nine" }, { "10", "ten" },
				{ "11", "eleven" }, { "12", "twelve" }, { "13", "thirteen" }, { "14", "fourteen" }, { "15", "fifteen" },
				{ "16", "sixteen" }, { "17", "seventeen" }, { "18", "eighteen" }, { "19", "nineteen" },
				{ "20", "twenty" }, { "30", "thirty" }, { "40", "forty" }, { "50", "fifty" }, { "60", "sixty" },
				{ "70", "seventy" }, { "80", "eighty" }, { "90", "ninety" }, { "100", "one hundred" },
				{ "200", "two hundred" }, { "300", "three hundred" }, { "400", "four hundred" },
				{ "500", "five hundred" }, { "600", "six hundred" }, { "700", "seven hundred" },
				{ "800", "eight hundred" }, { "900", "nine hundred" }, { "1000", "one thousand" } };
		this.listNumbers = listNumbers;
	}

	public int getLengthWithoutSpace(String str) {
		String chain;
		if (str != null && str.indexOf(" ") > 0) {
			chain = str.replaceAll(" ", "");
		} else
			chain = str;
		return chain.length();
	}
	
	//found numbes less 21 
	public String getNumberLessTwenty(Integer number) {
		boolean flag = false;
		int i;
		String resp = "";

		if (number < 21) {
			// for finding basic number in list
			for (i = 0; i < listNumbers.length && !flag; i++) {
				if (number.toString().equalsIgnoreCase(listNumbers[i][0])) {
					flag = true;
				}
			} // end for
			resp = listNumbers[i - 1][1];
		}
		return resp;
	} 
	
	public String getNumberBetweenTwentyOneAndNinetyNine(Integer number) {
		int base = 10;
		boolean flag = false;
		int i;
		String resp = "";
		Integer auxNumber = 0; 
		int value = 0 ;

		if (20 < number && number < 100) {
			
			value = (number / base) ;
			auxNumber = value * base;
			value = number - auxNumber ; 
			
			for (i = 0; i < listNumbers.length && !flag; i++) {
				if (auxNumber.toString().equalsIgnoreCase(listNumbers[i][0])) {
					flag = true;
				}
			} // end for
			resp = listNumbers[i - 1][1]; 
			
			if(value > 0 ) { 
				resp = resp + " " + getNumberLessTwenty(value);
			}
		
		}
		
		return resp;
	}
	
	public String getNumberBetweenOneHundredAndOneThousand(Integer number) {
		int base = 100;
		boolean flag = false;
		int i;
		String resp = "";
		Integer auxNumber = 0; 
		int value = 0 ;

		if (99 < number && number < 1001) {
			
			value = (number / base) ;
			auxNumber = value * base;
			value = number - auxNumber ; 
			
			for (i = 0; i < listNumbers.length && !flag; i++) {
				if (auxNumber.toString().equalsIgnoreCase(listNumbers[i][0])) {
					flag = true;
				}
			} // end for
			resp = listNumbers[i - 1][1]; 
			
			if(value > 20 ) { 
				resp = resp + " and " + getNumberBetweenTwentyOneAndNinetyNine(value);
			}
			
			if(0 < value && value < 21 ) { 
				resp = resp + " and " + getNumberLessTwenty(value);
			}
		
		}
		
		return resp;
	} 
	
	public String getNumberInText(Integer number) {
		
		String resp = "";
		
		if(number < 21) {
			resp = getNumberLessTwenty(number);
		}
		if(20 < number && number < 100) {
			resp = getNumberBetweenTwentyOneAndNinetyNine(number);
		} 
		if(99 < number && number <1001) {
			resp = getNumberBetweenOneHundredAndOneThousand(number);
		}
		System.out.println(number + " : " + resp);
		return resp ;
	}

	public static void main(String[] args) {
		Problem17 problema17 = new Problem17();

		String str = "";
		Integer sum = 0; 
		
		for( int j = 1; j < 1001; j++) {
			str = problema17.getNumberInText(j);
			sum = sum + problema17.getLengthWithoutSpace(str);
		}
		System.out.println("Total sum : " + sum);
	}
	
	
	
}
