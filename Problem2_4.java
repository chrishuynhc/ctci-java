import java.util.*;

public class Problem2_4 {
	
	public static void main(String args[]){
		Node list = makeList(new int[]{3,5,8,5,10,2,1});
		printList(list);
		list = partition(list, 5);
		printList(list);
	}
	
	public static Node partition(Node node, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		/* Partition list */
		while (node != null) {
			
			if (node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = beforeEnd.next;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = afterEnd.next;
				}
			}
			node = node.next;
			
		}
		beforeEnd.next = null;
		afterEnd.next = null;
		
		/* Merge before list and after list */
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
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
	
	public static void printList(Node head) {
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while (head != null) {
	    	list.add(head.data);
	    	head = head.next;
	    }
	    System.out.println(list);
	}
	
	static class Node {
		Node next;
		int data;
		
		public Node(int d){
			this.data = d;
		}
	}
}
