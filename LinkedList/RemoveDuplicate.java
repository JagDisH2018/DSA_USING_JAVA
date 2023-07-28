package LinkedList;

import LinkedList.SinglyLinkedListDemo.ListNode;

public class RemoveDuplicate {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//print
	public void display() {
		ListNode current = head;
		while(current != null){
			System.out.print(current.data+"-> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	//remove duplicate
	public void removeDuplicate() {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
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
			ListNode third = new ListNode(2);
			ListNode forth = new ListNode(3);
			ListNode fifth = new ListNode(3);
			ListNode sixth = new ListNode(4);
			
			head = first;
			first.next = second;
			second.next = third;
			third.next = forth;
			forth.next = fifth;
			fifth.next = sixth;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate rd = new RemoveDuplicate();
		rd.createALoopInLinkedList();
		//rd.removeDuplicate();
		rd.display();

	}

}
