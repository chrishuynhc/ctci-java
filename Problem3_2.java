import java.util.*;

public class Problem3_2 {
	
	static class Stack<T> {
		
		Node<T> head = null;
		Node<Node<T>> min = null;
		
		public Stack(){
			
		}
		
		public T pop(){
			if (head == null){
				throw new IllegalStateException("Empty Stack");
			}
			if (min.data == head){
				min = min.next;
			} 
			T val = head.data;
			head = head.next;
			return val;		
		}
		
		public void push(T data){
			
			if (head == null){
				head = new Node<>(data);
				min = new Node<>(head);
			} else {
				Node<T> node = new Node<>(data);
				if (((int) data) < ((int) min.data.data)) {
					Node<Node<T>> nextMin = new Node<Node<T>>(node);
					min.next = min;
					min = nextMin;
				}
				node.next = head;
				head = node;
			}		
		}
		
		public T min(){
			return min.data.data;
		}
	}

	static class Node<T> {
		Node next;
		T data;
		
		public Node(T d){
			this.data = d;
		}
	}
}
