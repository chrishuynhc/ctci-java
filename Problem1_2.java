import java.util.*;

public class Problem1_2 {
	
	public static void main(String args[]){
		System.out.println(isPermution("racecar", "carrace"));		//True
		System.out.println(isPermution("racecar", "Carrace"));		//False - case sensitive
		System.out.println(isPermution("racecar", "caradfadse"));	//False
	}
	
	public static boolean isPermution(String s, String t){
		
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		
		Arrays.sort(sChars);											
		Arrays.sort(tChars);										
		
		for (int i = 0; i < s.length(); i++){						
			if (sChars[i] != tChars[i]){
				return false;
			}
		}
		return true;												
	}
}
