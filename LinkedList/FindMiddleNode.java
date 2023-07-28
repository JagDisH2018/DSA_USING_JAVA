package LinkedList;

public class FindMiddleNode {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	
	//insert at begin
	public void insertAtBegin(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//find middle node
	public ListNode middleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr.next != null ) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	//print
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"-> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	//create LinkedList
	public void createLinkedList() {
		ListNode first = new ListNode(28);
		ListNode second = new ListNode(25);
		ListNode third = new ListNode(34);
		ListNode forth = new ListNode(81);
		ListNode fifth = new ListNode(54);
		ListNode sixth = new ListNode(3);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMiddleNode fmn = new FindMiddleNode();
		fmn.createLinkedList();
		fmn.display();
		
		System.out.println("\n------Middle Node------");
		ListNode mid = fmn.middleNode();
		System.out.println("Middle Node = "+ mid.data);

	}

}
