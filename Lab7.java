import java.util.*;

public class Lab7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack st = new Stack();

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String s1 = sc.nextLine();

			if (s1.startsWith("PUSH")) {
				st.push(Integer.parseInt(s1.substring(s1.indexOf(" ") + 1)));
			} else {
				st.pop();
			}
		}

		int max = 0;
		
		if(st.isEmpty()) {
			System.out.println("empty");
		}

		while (!st.isEmpty()) {
			max = Math.max(max, st.peek());
			st.pop();
		}

		if(max > 0) System.out.println(max);
	}
	
	
	public static class Stack {
		
		private static class Node {
			int data;
			Node next;

			private Node(int data) {
				this.data = data;
			}
		}

		private Node current;

		public void push(int data) {

			Node prev = current;
			current = new Node(data);
			current.next = prev;
		}

		public int pop() {
						
			if(current == null) {
				return 0;
			}
			Node deleteHead = current;
			current = current.next;
			return deleteHead.data;
		}

		public boolean isEmpty() {
			return (current == null);
		}
		
		public int peek() {
			return current.data;
		}
	}

}