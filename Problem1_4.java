import java.util.*;

public class Problem1_4 {

		public static void main(String args[]){
			
			System.out.println("Tact Coa is " + isPermutationOfPalindrome("Tact Coa"));
		}
		
		
		public static boolean isPermutationOfPalindrome(String s){
			
			return checkMaxOneOdd(buildCharFrequencyTable(s));
		}
		
		static boolean checkMaxOneOdd(int[] table){
			
			boolean found = false;
			
			for(int i = 0; i < table.length; i++){
				if (table[i] % 2 == 1){
					if (found){
						return false;
					}
					found = true;
				}
			}
			return true;
		}
		
		static int[] buildCharFrequencyTable(String s){
			
			int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
			for (char item: s.toCharArray()){
				int x = getCharNumber(item);				
				if (x != -1){
					table[x]++;
				}	
			}
			return table;
		}
		
		public static int getCharNumber(char c){
			
			int a = Character.getNumericValue('a');
			int z = Character.getNumericValue('z');
			int ch = Character.getNumericValue(c);
			
			if (ch >= a && ch <= z){
				return ch - a;
			}
			return -1;
		}		
}
