import java.util.*;

public class Problem2_1 {
	
	public static void main(String args[]){
		Node list = makeList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7});
	    printList(list);  
	    deleteDuplicates(list);
	    printList(list);
	}
	
	public static void deleteDuplicates(Node n){
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		
		while (n != null){
			if (set.contains(n.data)){
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}		
	}
	
	static class Node {
		
		Node next;
		int data;
		
		public Node(int d){
			data = d;
		}
	}
	
	public static Node makeList(int[] arr){
		
		Node n = null;
		Node head = null;
		
		for (int i: arr){
			if (n == null){
				n = new Node(i);
				head = n;
			} else {
				Node h = new Node(i);
				n.next = h;
				n = h;				
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
}
