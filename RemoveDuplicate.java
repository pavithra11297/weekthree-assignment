package week3.day2.assignment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split("");
		List<String> txt = new ArrayList<String>();
		for (String string : split) {
			txt.add(string);
		}        
        System.out.println("The list is defined as: " +txt.toString());
        Set<String> result_set = new LinkedHashSet<String>(txt);
        List<String> list=new ArrayList<String>(result_set);
        System.out.println("The list after removing the duplicates: "+list);
     }
	}


