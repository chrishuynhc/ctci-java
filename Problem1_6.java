import java.util.*;

public class Problem1_6 {
	
	public static void main(String args[]){
		
		System.out.println(compress("aabcccccaaa"));
	}
	
	public static String compress(String s){
		
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++){			
			count++;
			if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
				compressed.append(s.charAt(i));
				compressed.append(count);
				count = 0;
			}		
		}
		return compressed.length() > s.length() ? compressed.toString() : s;
	}
}
