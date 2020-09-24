
public class RPGCharactersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warrior c1 = new Warrior("Jim");
		Healer c2 = new Healer("Aaron", 10);
		
		c1.attack(5,  10);
		c2.heal(40, 90);
	}

}
