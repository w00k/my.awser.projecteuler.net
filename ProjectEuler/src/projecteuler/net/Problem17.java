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

	public static void main(String[] args) {
		String str = "Hola mundo en Java ... ";

		Problem17 problema17 = new Problem17();

		System.out.println("|" + str + "| length without spaces " + problema17.getLengthWithoutSpace(str));

	}

}
