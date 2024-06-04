package testesSahaja;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class setak_kuwewe {

	public static void main(String[] args) {
		Queue<Integer> kuwewe = new LinkedList<Integer>();
		kuwewe.add(1);
		kuwewe.add(2);
		kuwewe.add(3);
		kuwewe.add(4);
		Stutter(kuwewe);
		
		Queue<String> kuwewe2 = new LinkedList<String>();
		kuwewe2.add("a");
		kuwewe2.add("n");
		kuwewe2.add("j");
		kuwewe2.add("a");
		kuwewe2.add("y");
		Mirror(kuwewe2);
	}
	
	public static void Stutter(Queue<Integer> queue) {
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		while(!queue.isEmpty()) {
			queue2.add(queue.peek());
			queue2.add(queue.remove());
		}
		
		while (!queue2.isEmpty()) {
			queue.add(queue2.remove());
		}
		
		System.out.println("stutter:\nfront " + queue + " back");
	}
	
	public static void Mirror(Queue<String> queue) {
		Stack<String> stack = new Stack<String>();
		Queue<String> queue2 = new LinkedList<String>();
		
		while(!queue.isEmpty()) {
			stack.push(queue.peek());
			queue2.add(queue.remove());
		}
		
		while(!queue2.isEmpty()) {
			queue.add(queue2.remove());
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		System.out.println("mirror:\nfront " + queue + " back");
	}

}
