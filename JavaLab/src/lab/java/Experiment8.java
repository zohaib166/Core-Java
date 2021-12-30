package lab.java;
class Animal {
	public void eat() {
		System.out.println("Animal Eating: I eat ... munch munch");
	}
	public void sleep() {
		System.out.println("Animal Sleeping: Zzzzzz");
	}
}
class Bird extends Animal {
	public void eat() {
		System.out.println("Bird Eating: I eat insects and grains");
	}
	public void sleep() {
		System.out.println("Bird Sleeping: Zzzzzzz");
	}
	public void fly() {
		System.out.println("Bird Flying: Swooooosh");
	}
}
public class Experiment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println("Parent's Methods invoked....");
		a.eat();
		a.sleep();
		Bird b = new Bird();
		System.out.println("Child's Methods invoked....");
		b.eat();
		b.sleep();
		b.fly();
	}

}
