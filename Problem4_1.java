import java.util.*;

public class Problem4_1 {
	
	enum State { 
		Unvisited, Visited, Visiting;
	}
	
	boolean search(Graph g, Node start, Node end){
		
		if (start == end){
			return true
		}
		
		LinkedList<Node> q = new LinkedList<Node>();
		
		for (Node u: g.getNodes()){
			u.state = State.Unvisited;
		}
		
		start.state = State.Visiting;
		q.add(start);
		Node u;
		
		while (!q.isEmpty()){
			u = q.removeFirst();
			for (Node v : q.getAdjacent()){
				if (v.state == State.Unvisited){
					if (v == end){
						return true;
					} else {
						v.state = State.Visited;
						q.add(v);
					}
				}		
			}
		}
		return false;
	}
	
	static class Node{
		Node next;
		int data;
		State state;
		
		public Node(int d){
			this.data = d;
		}
	}
}
