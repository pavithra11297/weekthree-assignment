package week3.day2.assignment;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicateNumber {

	public static void main(String[] args) {
		String input="abbaba";
		Map<Character,Integer> value=new HashMap<Character,Integer>();
		char[] chararr=input.toCharArray();
		char maxOccur=input.charAt(0);
		int maxValue=0;
		for(int i=0;i<chararr.length;i++)
		{
			value.put(chararr[i], value.getOrDefault(chararr[i], 0)+1);
			if(value.get(chararr[i])>maxValue)
			{
				maxOccur=chararr[i];
				value.get(chararr[i]);
			}
		}
		System.out.println(maxOccur);
	}
}

