import java.util.*;

public class Problem1_3 {

	public static void main (String[] args){
		
		String s = "Mr John Smith    ";
		char[] sChar = s.toCharArray();
		replaceSpaces(sChar, 13);		
		System.out.println(sChar);
	}
	
	public static void replaceSpaces(char[] s, int trueLength){
		
		int spaces = 0;
		
		for (int i = 0; i < trueLength; i++){
			if (s[i] == ' '){
				spaces++;
			}
		}
		
		int index = (trueLength + spaces * 2) - 1;
		
		for (int i = trueLength - 1; i >= 0; i--){
			if (s[i] != ' '){
				s[index] = s[i];		
			} else {
				s[index] = '0';
				index--;
				s[index] = '2';
				index--;
				s[index] = '%';			
			}
			index--;
		}		
	}
}
