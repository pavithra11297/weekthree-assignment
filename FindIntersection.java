package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] input1 = { 3, 2, 11, 4, 6, 7, 8 }; 
		int[] input2 = { 1, 2, 8, 4, 9, 7 }; 
		// Creating object for ArrayList class
		List<Integer> list = new ArrayList<Integer>();
		// Looping first array
		for (Integer value1 : input1) {
			// add the input1 value to list object
			list.add(value1);
		}
		// for loop for second array
		for (Integer result : input2) {
			// checking whether ArrayList have the value from second array
			if (list.contains(result)) {
				System.out.println(result);
			}
		}

	}


}
