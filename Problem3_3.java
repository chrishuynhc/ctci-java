import java.util.*;

public class Problem3_3 {
	
	static class SetOfStacks{
		
		ArrayList<Stack> stacks = new ArrayList<Stack>();
		int threshold = 10;
				
		public void push(int data){
			
			Stack last = getLastStack();
			if (last != null && !isFull(last)){
				last.push(data);
			} else {
				Stack stack = new Stack();
				stack.push(data);
				stacks.add(stack);
			}
		}
		
		public boolean isFull(Stack stack){
			
			if (stack.size() == threshold){
				return true;
			} else {
				return false;
			}
		}
		
		public int pop(){
			
			Stack last = getLastStack();
			if (last == null){
				throw new EmptyStackException();
			}
			int data = (int) last.pop();
			if (last.size() == 0){
				stacks.remove(stacks.size() - 1);
			}
			return data;
		}
		
		public Stack getLastStack(){
			return stacks.get(stacks.size() - 1);
		}
	}
}
