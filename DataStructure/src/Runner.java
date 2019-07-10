
public class Runner {

	public static void main(String[] args) {

		Queue q = new Queue();
		//adding elements in the Queue
		
		//checking for full-STACK
		System.out.print(q.isFull());
		System.out.print(q.isEmpty());
		
		q.dequeue();
		
		q.enQueue(23);
		q.enQueue(44);
		q.enQueue(45);
		q.enQueue(44);
		q.enQueue(45);
		q.enQueue(44);
		q.enQueue(45);
		
		System.out.print("\nSize : " + q.getSize()+"\n");
		q.show();
		
		
//		//******STACK using Dynamic array*****//
//		DStack num = new DStack();
//		num.push(23);
//		num.push(23);
//		num.push(23);
//		num.push(23);
//		num.push(23);
//		num.display();
//		num.pop();
//		num.display();
		
		
		//*****STACK using static array******//
		
//		Stack num = new Stack();
//		//isEmpty will be true as nothing is added yet
//		System.out.println(num.isEmpty());
//		num.push(3);
//		num.push(2);
//		System.out.print(num.peek()+" This is peek\n");
//		num.push(4);
//		//will be false as stack is not empty
//		System.out.println(num.isEmpty());
//		System.out.print(num.pop()+" This is pop\n");
//		num.display();
		
		
		//*****Linked List*******//
//		LinkedList list = new LinkedList();
//		list.insert(13);
//		list.insert(45);
//		list.insert(25);
//		list.insertAtStart(56);
//		
//		list.insertAt(2,46);
//		list.display();
//		list.deleteAt(3);
//		list.display();
	}

}
