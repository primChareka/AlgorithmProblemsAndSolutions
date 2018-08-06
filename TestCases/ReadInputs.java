package TestCases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ReadInputs {

	public static void ReadFile(String fileName, ArrayList<Integer> myArray) {
		try {
			// Initializing file reading requirements
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			StringTokenizer stk;
			String number;

			// Generate new item for every line read
			while ((line = bufferedReader.readLine()) != null) {

				stk = new StringTokenizer(line, ",");
				while (stk.hasMoreTokens()) {
					number = stk.nextToken();
					myArray.add(Integer.parseInt(number));
				}

			} // end while
			fileReader.close();
		} // end try
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ReadFile(String fileName, LinkedList<Integer> myList) {
		try {
			// Initializing file reading requirements
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			StringTokenizer stk;
			String number;

			// Generate new item for every line read
			while ((line = bufferedReader.readLine()) != null) {

				stk = new StringTokenizer(line, ",");
				while (stk.hasMoreTokens()) {
					number = stk.nextToken();
					myList.add(Integer.parseInt(number));
				}

			} // end while
			fileReader.close();
		} // end try
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
