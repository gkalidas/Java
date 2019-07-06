
public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		//by default object is null
		//below line is for user ref only
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			//
			Node n = head;
			while(n.next!=null) {
				 n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	public void display() {
		Node node = head;
		
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
