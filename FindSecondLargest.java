package week3.day2.assignment;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		// Arrange the array in ascending order
		Arrays.sort(data); 
		int len = data.length-2;
		System.out.println(data[len]+ " is the second element from the last after sorting array" );

	}

}
