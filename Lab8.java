import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		Queue pq = new Queue();
		
		for(int i = 0; i < n; i++) {
			
			String s1 = sc.nextLine();
			
			if(s1.startsWith("INSERT")) {
				pq.insert(s1.substring(s1.indexOf(" ")+1));
			} else {
				pq.remove();
			}
		}
		
		System.out.println(pq.getHead());

	}
	
	public static class Queue {
		
		public static class Node {
			
			String data;
			Node next;
			
			public Node(String data) {
				
				this.data = data;
			}
		}
		
		Node head;
		
		public void insert(String data) {
			
			Node newNode = new Node(data);
			
			if(head == null) {
				head = newNode;
			}
			else {	
				
				Node current = head;
				Node prev = null;
				
				while(current != null && compare(current.data, data)) {
					
					prev = current;
					current = current.next;
				}
				
				if(prev == null) {
					
					newNode.next = current;
					head = newNode;
				}
				else {
					
					prev.next = newNode;
					newNode.next = current;
				}
			}
		}
		
		public boolean compare(String before, String after) {
			
			if(after.length() > before.length()) {
				
				return true;
			} 
			else if(after.length() == before.length())
			{
				if(after.compareTo(before) > 0) {
					
					return true;
				}
			}
			return false;
		}
		
		public void remove() {
			
			head = head.next;
		}
		
		public String getHead() {
			
			return head.data;
		}
	}
}
