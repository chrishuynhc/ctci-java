import java.util.*;

public class Problem4_2 {
	
	public static void main(String[] args){
		
	}
	
	TreeNode createMinimalBST(int[] array){
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	TreeNode createMinimalBST(int[] arr, int start, int end){
		if (start < end){
			return null;
		}
		
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr, start, mid - 1);
		n.right = createMinimalBST(arr, mid + 1, end);
		
		return n;
	}
}
