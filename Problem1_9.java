import java.util.*;

public class Problem1_9 {

	public static void main(String args[]){
		String s = "waterbottle";
		String t = "erbottlewat";
		
		System.out.println(isRotation(s,t) + "is true");
	}
	
	public static boolean isRotation(String s1, String s2){
		
		int len = s1.length();
		
		//Checking that s1 and s2 are same length
		if (len == s2.length() && len > 0){
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);					//assume method already defined
		}
		return false;
	}
}
