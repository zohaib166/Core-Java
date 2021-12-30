package lab.java;

abstract class Fruit {
	public String name, taste, size;
	
	public Fruit(String name, String taste, String size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	public void eat() {	
		System.out.println("I am "+name+ ", I taste "+taste+", I am "+size);
	}
}
class Apple extends Fruit {

	public Apple(String name, String taste, String size) {
		super(name, taste, size);
	}
	
}
class Orange extends Fruit {

	public Orange(String name, String taste, String size) {
		super(name, taste, size);
	}
	
}
public class Experiment9 {
	public static void main(String[] args) {
		Fruit a = new Apple("Apple","sweet","mid-sized");
		System.out.println("Tasting apple");
		a.eat();
		Fruit o = new Orange("Orange","citrus","mid-sized");
		System.out.println("Tasting orange");
		o.eat();
	}
}
