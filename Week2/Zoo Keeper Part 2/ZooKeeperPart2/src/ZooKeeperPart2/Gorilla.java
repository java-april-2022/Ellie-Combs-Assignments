package ZooKeeperPart2;
	public class Gorilla extends Mammal{
		public Gorilla() {
			super();
		}
		
		public Gorilla(String animalName) {
			super();
			this.Energy = 400;
			this.Name = animalName;
		}
		
		public void throwSomething() {
			System.out.println("The Gorilla threw bananas to me.");
			Energy -= 5;
		}
		
		public void eat() {
			System.out.println("The Gorilla ate a banana with me.");
			Energy += 10;
		}
		
		public void climb() {
			System.out.println("The Gorilla climbed a tree.");
			Energy -= 10;
		}
		
	}

