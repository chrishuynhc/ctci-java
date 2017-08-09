import java.util.*;

public class Problem2_5 {

	public static Node makeList(int[] arr){
		
		Node head = null;
		Node n = null;
		
		for (int i: arr){
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
