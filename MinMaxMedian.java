package LabProgram408;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MinMaxMedian {

	// Input 5 Integers and return the Integers in an ArrayList
	public static ArrayList<Integer> inputIntegers(Scanner scnr) {
		/* Type your code here. */
		ArrayList<Integer> myArray = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			myArray.add(scnr.nextInt());
		return myArray;
	}

	// Input 5 Doubles and return the Doubles in an ArrayList
	public static ArrayList<Double> inputDoubles(Scanner scnr) {
		/* Type your code here. */
		ArrayList<Double> myArray = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			myArray.add(scnr.nextDouble());
		return myArray;
	}

	// Input 5 Strings, and return the Strings in an ArrayList
	public static ArrayList<String> inputWords(Scanner scnr) {
		/* Type your code here. */
		ArrayList<String> myArray = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			myArray.add(scnr.next());
		return myArray;
	}

	// Output the elements of the ArrayList parameter
	public static <TheType extends Comparable<TheType>> void print(ArrayList<TheType> list) {
		/* Type your code here. */
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}

	// Return the min, median, and max of the ArrayList parameter in a new ArrayList
	public static <TheType extends Comparable<TheType>> ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
		/* Type your code here. */
		Collections.sort(list); 
		ArrayList<TheType> tempList = new ArrayList<>();
		tempList.add(list.get(0));
		tempList.add(list.get(list.size()/2));
		tempList.add(list.get(list.size()-1));
		return tempList;		
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Input a list of 5 Integers and print the ArrayList's statistics
		ArrayList<Integer> integers = inputIntegers(scnr);
		print(integers);
		ArrayList<Integer> integerStatistics = getStatistics(integers);
		print(integerStatistics);
		System.out.println();

		// Input a list of 5 Doubles and print the ArrayList's statistics
		ArrayList<Double> doubles = inputDoubles(scnr);
		print(doubles);
		ArrayList<Double> doubleStatistics = getStatistics(doubles);
		print(doubleStatistics);
		System.out.println();

		// Input a list of 5 words (Strings) and print the ArrayList's statistics
		ArrayList<String> words = inputWords(scnr);
		print(words);
		ArrayList<String> wordStatistics = getStatistics(words);
		print(wordStatistics);
	}
}
