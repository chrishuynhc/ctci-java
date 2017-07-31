import java.util.*;

public class Problem1_5 {
	
	public static void main(String args[]){
		
		System.out.println(oneEditAway("pale", "ple") + " is true");
		
	}
	
	public static boolean oneEditAway(String s, String t){
		
		if (s.length() == t.length()){
			return checkReplace(s,t);
		}
		else if (s.length() == t.length() - 1){
			return checkInsert(s,t);
		}
		else if (s.length() - 1 == t.length()){
			return checkInsert(t,s);
		}
		return false;
	}
	
	public static boolean checkReplace(String s, String t){
	
		boolean found = false;
		
		for (int i = 0; i < s.length(); i++){					//Checks max replace is one!
			if (s.charAt(i) != t.charAt(i)){			
				if (found){
					return false;
				}
				found = true;
			}
		}
		return true;
	}
	
	public static boolean checkInsert(String s, String t){
		
		int index1 = 0;
		int index2 = 0;
		
		while(index1 < s.length() && index2 < t.length()){
			if (s.charAt(index1) != t.charAt(index2)){
				if (index1 != index2){
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}			
		}	
		return true;
	}
	
	

}
