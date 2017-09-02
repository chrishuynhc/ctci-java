import java.util.*;

public class Problem10_1 {

	public static void main(String[] args){
		
		
	}
	
	public void merge(int[] a, int[] b, int lastA, int lastB){
		
		int currentA = lastA - 1;
		int currentB = lastB - 1;
		int current = lastA + lastB - 1;
		
		while (currentA >= 0){
			if (a[currentA] > b[currentB]){
				a[current] = a[currentA];
				currentA--;
			} else {
				a[current] = b[currentB];
				currentB--;
			}
			current--;
		}	
	}
}
