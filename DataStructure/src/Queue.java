public class Queue {
	int Queue[] = new int[5];
	int size, front, rear;
	
	public void enQueue(int data) {
		Queue[rear] = data;
		rear++;
		size++;
	}
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print(Queue[i] + " ");
		}
	}
}
