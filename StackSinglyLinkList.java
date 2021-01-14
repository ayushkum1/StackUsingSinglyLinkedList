package stackwithsinglylinklist;



public class StackSinglyLinkList implements StackSinglyList {

	class SListNode {
		int data;
		SListNode next;
	}

	private SListNode stack;
	private SListNode head;
	
	

	@Override
	public void push(int no) {
		stack = new SListNode();
		System.out.println(no+" Pushed Into Stack");
		stack.data=no;
		stack.next=head;
		head=stack;
	}

	@Override
	public void pop() {
		SListNode current = head;
		if (current == null)
			System.out.println("Stack is empty !!");
		else {
			if (current.next != null) {
				System.out.println(current.data+" Is Poped From Stack !!");
				current.data = current.next.data;
				current.next = current.next.next;
				
			} else {
				System.out.println(head.data+" Is Poped From Stack !!");
				head = null;
			}
		}

	}

	@Override
	public void display() {
		SListNode current = head;
		if(current==null)
			System.out.println("Stack is Empty");
		else {
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}}

	}

}
