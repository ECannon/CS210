import java.util.*;

public class Lab9 {
	
    public static void main(String[] args) {
    	
		LinkedList l1 = new LinkedList();
		
		l1.insertHead(1);
		l1.insertHead(2);
		l1.insertHead(3);
		l1.insertHead(4);
		l1.insertHead(5);
		l1.insertHead(6);
		l1.insertHead(7);
		
		l1.head.next.next.next.next.next.next.next = l1.head.next.next;
		
		System.out.println(getLoopLength(l1));

    }
    
    //Floyd's Algorithm
    public static int getLoopLength(LinkedList l1) {
    	
    	Node fast = l1.head;
    	Node slow = l1.head;
    	int count = 1;
    	
    	if(l1.isEmpty()) return 0;
    	
    	while(fast != null && fast.next != null) {
    		
    		fast = fast.next.next;
    		slow = slow.next;
    		
    		if(fast == slow) {
    			
    			while(slow.next != fast) {
    				count++;
    				slow=slow.next;
    			}
    			return count;
    		}
    	}
    	
    	//return 0 if no loop is found;
    	return 0;
    	
    } 	
}

class Node 
{
	int data;
	Node next;
	Node previous;
	    
	public Node(int data) {
		this.data = data;
	}
}

class LinkedList
{	
	Node head;
	
	public void insertHead(int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
		} else {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public boolean isEmpty() { 
		return head == null;
	}
	
}
