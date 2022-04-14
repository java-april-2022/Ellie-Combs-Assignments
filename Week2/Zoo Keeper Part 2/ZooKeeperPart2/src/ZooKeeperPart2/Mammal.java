package ZooKeeperPart2;

public class Mammal {
		public int Energy;
		public String Name;
		
		public Mammal() {
			
		}
		
		public Mammal(String animalName) {
			Name = animalName;
		}

		public Mammal(int energyLevel) {
			this.Energy = energyLevel;
			
			
		}

		public void getEnergyLevel() {
			String Smack = String.format("%s level of energy!",this.Energy);
			System.out.println(Smack);
		}
	}

