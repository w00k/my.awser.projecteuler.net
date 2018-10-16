package projecteuler.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 What is the total of all the name scores in the file?
*/

public class Problem22 {

	private static String path = "C:\\Users\\Pancho\\Documents\\workspace\\ProjectEuler\\src\\projecteuler\\net\\resources\\names.txt";
	private static File file = null;
	private static List<String> nameList = new ArrayList<>();
	private List<String> alphabetValue = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

	public static void main(String[] args) throws IOException {

		Problem22 problem = new Problem22();

		problem.addData();
		Integer index = 1, result = 0;
				
		System.out.println("size : " + nameList.size());

		for (String str : nameList) {
			System.out.println("name : " + str + ", index : " + index);
			result = result + problem.getValue(str.toUpperCase(), index);
			index++;
		}
		
		System.out.println("result : " + result);

	}

	public void addData() throws IOException {
		file = new File(path);
		BufferedReader br = null;
		String st = "";
		Integer start = 0, end = 0;
		boolean isLast = false;

		try {
			System.out.println("start data ... ");
			br = new BufferedReader(new FileReader(file));
			st = br.readLine();
			br.close();

			while (st.length() > 1) {
				start = 1 + st.indexOf("\"");
				end = st.indexOf("\",");
				if (end < 0) {
					end = st.length() - 1;
					isLast = true;
				}

				nameList.add(st.substring(start, end));

				if (!isLast) {
					st = new String(st.substring(end + 2, st.length()));
				} else {
					st = ".";
				}
			}

			nameList.sort(String::compareToIgnoreCase);
			System.out.println("end data ...");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int getAlphabetValue(String letter) {
		int value = alphabetValue.indexOf(letter);

		if (value < 0) value = 0;

		return value+1;
	}

	public Integer getValue(String name, Integer position) {

		int index = 0;
		Integer totalSize = 0;
		while (name.length() > index) {

			totalSize = totalSize + getAlphabetValue(""+name.charAt(index));
			
			index++;
		}

		return (totalSize * position);
	}

}
