package inheritance2;

public class BreakableObject extends Game_Object {

	//Accepts name, hp, experience
	//Ex. BreakableObject(Barrel, 3, 25)
	BreakableObject(String n, int hp, int exp) {
		setName(n);
		setHp(hp);
		setExperience(exp);
	}
	
	@Override
	public void interact() {
		//Some keyboard or mouse command to trigger this
		takeDamage();
	}

	@Override
	public void attack() {
		
	}

	@Override
	public void takeDamage() {
		//function to add hp and experience to GameCharacter (player and allies)
		yamcha();
	}

	@Override
	public void evasion() {
		
	}

	@Override
	public void yamcha() {
		//break animation function
		//Deletes object
		setName(null);
		setHp(0);
		setExperience(0);
		
	}

}
