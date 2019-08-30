package objectBehavior;

public class DogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog();
		one.size = 70;
		
		Dog two = new Dog();
		one.size = 8;
		
		Dog three = new Dog();
		one.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
	}
}


/* Every object of the same type have different behavior */