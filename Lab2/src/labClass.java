/*
 * This is an LIFO (Last In First Out) implementation of Linked List
 * 
 * 
 * 
 */





class Node{
	public int key; 
	public Node next; 
}

class LinkedList{
		
private Node head; 
	
	public void push( int data) { // INSERT 
	
		// don't need to pass list because head is already declared
		Node newNode = new Node(); 
		newNode.key = data; 
		newNode.next = head; 
		
		head = newNode; 
	}
	
	public void pop() { // fifo pop 
		
		Node temp = new Node(); 
		Node prev = new Node(); 
		
		temp.next = head; 
		
		while(temp.next!= null) {
		
			prev = temp; 
			temp = temp.next; 
		
		}
		
		prev.next = null; 
		
	}
	
	public void lifo_pop(){
		Node temp = new Node(); 
		
		if(head!= null){
			temp = head.next; 
			head = temp; 
		}
	}
	
	
	public void display() {
		
		System.out.println("\t\tdisplay called"); 
		System.out.println("\t\thead.key = " + head.key); 
		Node temp = new Node(); 
		temp = head;
		
		System.out.println("\t\tList Below: "); 
		
		while(temp != null) {
			System.out.print( "->" + temp.key);
			temp = temp.next; 
		}
	}
	
}



public class labClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World"); 
		LinkedList myLinkedList = new LinkedList(); 
	
		myLinkedList.push(12);
		myLinkedList.push(1);
		myLinkedList.display();

		
		myLinkedList.push(2);
		myLinkedList.display();
		
		myLinkedList.push(3);
		myLinkedList.display();
		
		myLinkedList.push(4);
		myLinkedList.display();
		
		
		System.out.println("\t\tFirst Pop");
		myLinkedList.pop(); 
		myLinkedList.display();
			
	

		System.out.println("\t\t2nd Pop"); 
		myLinkedList.pop(); 
		myLinkedList.display();
		
		
		System.out.println("\t\t1st lifo Pop"); 
		myLinkedList.lifo_pop(); 
		myLinkedList.display();
	}

}
