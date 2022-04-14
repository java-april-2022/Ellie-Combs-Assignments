package ZookeeperPart1;

public class Gorilla extends Mammal{
	public Gorilla(int displayEnergy) {
		super(displayEnergy);
	}
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The Gorilla threw bananas to me.");
		displayEnergy -= 5;
	}
	
	public void eat() {
		System.out.println("The Gorilla ate a banana with me.");
		displayEnergy += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla climbed a tree.");
		displayEnergy -= 10;
	}
	
	//Instance
	public static void main(String[] args) {
		Gorilla Giorgio = new Gorilla(0);
		Giorgio.throwSomething();
		Giorgio.eat();
		Giorgio.climb();
		Giorgio.throwSomething();
		Giorgio.eat();
		Giorgio.throwSomething();
	}
}
