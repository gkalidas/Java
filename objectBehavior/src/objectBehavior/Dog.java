package objectBehavior;
//The size affects the bark
public class Dog {
	int size;
	String name;
	
	void bark() {
		if(size > 60) {
			System.out.println("Woof! Woof!");
		}
		else if(size >14) {
			System.out.println("Rufff! Ruff!");
		}
		else {
			System.out.println("Yip Yip!");
		}
	}
}
