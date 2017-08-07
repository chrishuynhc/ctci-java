import java.util.*;

public class Problem2_2 {
	
	public static void main(String[] args){
		
		Node list = makeList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7}); 
		printKthToLast(list, 5);
		System.out.println(findKthToLast(list, 5).data);	
	}
	
	public static int printKthToLast(Node head, int k){
		
		if (head == null){
			return 0;
		}
		
		int index = printKthToLast(head.next, k) + 1;
		if (index == k){
			System.out.println(head.data);
		}		
		return index;
	}
	
	public static Node findKthToLast(Node head, int k){
		
		Node p1 = head;
		Node p2 = head;
		
		for (int i = 0; i < k; i++){
			p1 = p1.next;
		}
		
		while (p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}
	
	public static Node makeList(int[] arr){
		
		Node n = null;
		Node head = null;
		for (int i:arr){
			if (n == null){
				n = new Node(i);
				head = n;
			} else {
				n.next = new Node(i);
				n = n.next;
			}
		}
		return head;
	}
	
	static class Node {
		Node next;
		int data;
		
		public Node(int d){
			this.data = d;
		}
	}	
}
