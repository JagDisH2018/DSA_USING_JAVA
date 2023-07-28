package LinkedList;

public class Nth_Node_From_End {
	
	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode  next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//print
	public void display() {
		ListNode current  = head;
		while(current != null) {
			System.out.print(current.data + "-> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	//Nth node from end
	public ListNode getNthNodeFromEnd(int n) {
		
		ListNode mainPtr = head ; 
		ListNode refPtr = head;
		int count =0;
		while(count<n) {
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	
	// create LinkedList
	public void createLinkedList() {
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(7);
		ListNode third = new ListNode(5);
		ListNode forth = new ListNode(8);
		
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = forth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nth_Node_From_End nfe = new Nth_Node_From_End();
		nfe.createLinkedList();
		nfe.display();
		
		ListNode nEnd = nfe.getNthNodeFromEnd(3);
		System.out.println("\nNth Node from end = "+ nEnd.data);

	}

}
