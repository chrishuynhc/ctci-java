import java.util.*;

public class Problem3_2 {
	
	public static void main(String[] args) {
		
	    Stack<Integer> stack = new Stack<Integer>();

	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
	    stack.push(-1);
	    stack.push(3);
	    stack.push(4);

	    System.out.println(stack.min() + " should be -1");
	    System.out.println(stack.pop() + " should be 4");
	    System.out.println(stack.pop() + " should be 3");
	    System.out.println(stack.pop() + " should be -1");
	    System.out.println(stack.min() + " should be 1");
	}
	
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
				Node<T> node = new Node<T>(data);
				if (((int) data) < ((int) min.data.data)) {
					Node<Node<T>> nextMin = new Node<Node<T>>(node);
					nextMin.next = min;
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
