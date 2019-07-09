public class DStack {
	
	//creating static stack using linkedList
	int capacity = 2;
	int stack[] = new int[capacity];
	//this(top) variable will store the last element added
	int top = 0;
	public void push(int data) {
		if(size()==capacity) {
			//we are doubling the size of current array
			expand();
		}
		stack[top]= data;
		top ++;
	}
	
	private void expand() {
		// TODO Auto-generated method stub
		int length = size();
		//creating the array size of two times the previous one
		int[] newStack = new int[capacity *2];
		//copying current stack to newStack using arrayCopy method
		//five parameters as (fromArrayName, fromPosition, toArrayName, toStartPosition, howManyelements)
		System.arraycopy(stack, 0, newStack, 0, length);
		//referencing old stack with new one
		stack = newStack;
		//also increasing the capacity
		capacity *=2;
	}

	public int pop() {
		int data=0;
		
		if(isEmpty()) {
			System.out.print("Cannot pop, the stack is empty\n");
		}
		else {
			
			top--;
			data = stack[top];
			stack[top]=0;
			shrink();
		}
		return data;
	}
	private void shrink() {
		// TODO Auto-generated method stub
		int length = size();
		//capacity/2/2 will give the 1/4 of the current capacity
		if(length<(capacity/2/2)) {
			capacity /=2;
		}
		int newStack[] = new int[capacity/2];
		System.arraycopy(stack,0,newStack, 0, length);
		stack = newStack;
	}

	//peek is similar to pop somehow
	public int peek() {
		int data;//we just don't decrement the top
		data = stack[top-1];//also we don't delete the element from stack
		return data;
	}
	
	public int size() {
		//top will give us the size from the list
		return top;
	}
	public boolean isEmpty() {
		//checking whether top is less than or equal to zero
		return top<=0;
	}
	public void display() {
		for(int n: stack) {
			System.out.print(" "+n);
		}
		System.out.println();
	}
}
