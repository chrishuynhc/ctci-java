import java.util.*;

public class Problem1_1{
	
	public static void main (String[] args){
			System.out.println(isUniqueChars("bagels"));	//True
			System.out.println(isUniqueChars("chicken"));	//False
	}
	
	public static boolean isUniqueChars(String s){
		
		char[] stringChars = s.toCharArray();
		Arrays.sort(stringChars);							//O(n log n)
		
		for (int i = 0; i < stringChars.length - 1; i++){	//O(n)
			if (stringChars[i] == stringChars[i+1]){
				return false;
			}
		}
		return true;										//Overall runtime: O(n log n)
	}	
}