package ZookeeperPart1;
public class Mammal {
	public int displayEnergy;

	public Mammal() {
		super();
	}
	//Constructor
	public Mammal(int energyLevel) {
		this.displayEnergy = energyLevel;
	}

	public void getEnergyLevel() {
		String Smack = String.format("%s level of energy!",this.displayEnergy);
		System.out.println(Smack);
	}
}
