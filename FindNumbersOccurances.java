package week3.day2.assignment;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;


public class FindNumbersOccurances {

	public static void main(String[] args) {
//		public static void main(String[] args) {
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		// declaring map object field with Treemap class
		Map<Integer, Integer> values = new TreeMap<Integer, Integer>();
		for (int i : input) {
			// check whether the key value already there
			if (values.containsKey(i)) {
				// If yes add one to the value of the key
				values.put(i, values.get(i) + 1);
			} else {
				// if not have the value for key is 1
				values.put(i, 1);
			}
		}
		//Convey the value as each set and print the output
		Set<Entry<Integer, Integer>> value = values.entrySet();
		for (Entry<Integer, Integer> entry : value) {
			System.out.print(entry.getKey());
			System.out.print(" -> ");
			System.out.println(entry.getValue());

		}
		
	}

}