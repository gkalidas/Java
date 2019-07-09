public class Stack {
	
	//creating static stack using array
	//we can create dynamic using linked list also
	int stack[] = new int[5];
	//this(top) variable will store the last element added
	int top = 0;
	public void push(int data) {
		if(top==5) {
			System.out.println("Can't add element, stack is full\n");
		}
		else {
			stack[top]= data;
			top ++;
		}
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
		}
		return data;
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
			System.out.println(n);
		}
	}
}
