
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(13);
		list.insert(45);
		list.insert(25);
		list.insertAtStart(56);
		
		list.insertAt(2,46);
		list.display();
		list.deleteAt(3);
		list.display();
	}

}
