package LinkedList;

public class SinglyLinkedListDemo {
	
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//insert at begin
	public void insertAtbegin(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//insert at position
	public void insertAtPosition(int value, int pos) {
		ListNode newNode = new ListNode(value);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count<pos-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		
		}
	}
	
	
	//insert at end
	public void insertAtend(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	//delete at first
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//delete at end
	public ListNode deleteEnd() {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	//delete at position
	public void deletePos(int position) {
		if(position == 1) {
			head = head.next;
		}else {
			ListNode previous = head;
			int count =1;
			while(count<position -1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	//print element
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"-> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	//create linkedList data
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListDemo sll = new SinglyLinkedListDemo();
		sll.createALoopInLinkedList();
		sll.printList();
		
		System.out.println("\nInsert at Begin ");
		sll.insertAtbegin(12);
		sll.printList();
		
		System.out.println("\nInsert at end ");
		sll.insertAtend(87);
		sll.printList();
		
		System.out.println("\nInsert at Position = [5] ");
		sll.insertAtPosition(100, 5);
		sll.printList();
		
		System.out.println("\nDelete at first ");
		sll.deleteFirst();
		sll.printList();
		
		System.out.println("\nDelete at Last ");
		sll.deleteEnd();
		sll.printList();
		
		System.out.println("\nDelete at Position ");
		sll.deletePos(4);
		sll.printList();

	}

}
