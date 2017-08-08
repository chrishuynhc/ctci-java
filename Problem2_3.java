import java.util.*;

public class Problem2_3 {
	
	public static void main(String[] args){
		
		
	}
	
	boolean deleteMiddleNode(Node n){
		
		if (n != null || n.next != null){
			return false;
		}
		
		Node next = n.next;
		n.next = next.next;
		n.data = next.data;
		return true;
	}
	
	static class Node {
		Node next;
		int data;
		
		public Node(int d){
			this.data = d;
		}
	}
}
