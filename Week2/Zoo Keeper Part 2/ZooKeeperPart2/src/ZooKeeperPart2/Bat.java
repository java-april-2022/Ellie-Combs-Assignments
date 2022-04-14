package ZooKeeperPart2;

public class Bat extends Mammal {
	public Bat() {
		super();
	}
	
	//Constructor
	public Bat(String animalName) {
		super();
		this.Energy = 300;
		this.Name = animalName;
	}
	
	public void fly() {
		System.out.println("BAT MAN!!!.");
		Energy += 50;
	}
	
	public void eatHumans() {
		System.out.println("I eat Humans...");
		Energy += 25;
	}
	public void attackTown() {
		System.out.println("Bat attack is BACK.");
		Energy -= 100;
	}
}
