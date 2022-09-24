package week3.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		int count=0;
		// Sort the array	
		Arrays.sort(arr); 
		int len=arr.length;
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=arr[0];i<len;i++)
			// check if the iterator variable is not equal to the array values respectively
		{
			if(arr[count]==i)
			{
				count++;
			}
			else
			{  		// print the number
				System.out.println("Missing Element In An Array is: " +i);
				break; 		// once printed break the iteration
			}
		}
	}
}
