public class Queue {
	int Queue[] = new int[3];
	int size, front, rear;
	
	public void enQueue(int data) {
		if(!isFull()) {
		Queue[rear] = data;
		//making array circular 
		rear= (rear+1) %5;
		size++;
		}
		else
			System.out.print("Queue is Full");
	}
	
	public int dequeue() {
		int data = front;
		if(!isEmpty()) {
		//we need to return the deleted data
		//and move front to next location
		//and reduce size
		
		//making array circular
		front = (front+1)%5;
		size -=1;
		}
		else {
			System.out.print("Queue is Empty");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize()==0;
	}
	
	public boolean isFull() {
		return getSize()==3;
	}
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			//starting from front
			System.out.print(Queue[(front+i)%5] + " ");
		}
	}
}
