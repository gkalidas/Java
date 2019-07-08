
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
	
	public void insertAt(int index, int data) {
		if(index==0) {
			insertAtStart(data);
		}
		else {
		//creating new node
		Node node = new Node();
		//traversing of the current LinkedList using 'n' and for loop
		Node n = new Node();
		//initially node will be pointing to the head
		n = head;
		for(int i=0;i<index-1;i++) {
			n =n.next;
		}
		//current node is pointing to the next node
		node.next = n.next;
		//n.next node is previous node now pointing to the current node
		n.next = node;
		//current node's data
		node.data = data;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			//head will point to next node and we're good to proceed
			head = head.next;
		}
		else {
		//node to be deleted
		Node node = head;
		//temporary saving node
		Node n1 = null;
		for(int i = 0;i<index-1;i++) {
			node = node.next;
		}
		//node to be deleted
		n1 = node.next;
		//previous node will pointing to "next to next node"
		//like "n -> n1 -> next"
		node.next = n1.next;
		n1 = null;
		}
	}
	public void display() {
		//initializing node to head
		System.out.println("\n");
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
