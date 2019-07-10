public class Queue {
	int Queue[] = new int[5];
	int size, front, rear;
	
	public void enQueue(int data) {
		Queue[rear] = data;
		//making array circular 
		rear= (rear+1) %5;
		size++;
	}
	
	public int dequeue() {
		//we need to return the deleted data
		//and move front to next location
		//and reduce size
		int data = front;
		//making array circular
		front = (front+1)%5;
		size -=1;
		return data;
	}
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			//starting from front
			System.out.print(Queue[(front+i)%5] + " ");
		}
	}
}
