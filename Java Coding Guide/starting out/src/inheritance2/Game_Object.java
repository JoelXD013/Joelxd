package inheritance2;

public abstract class Game_Object {

	private String name;
	private int hp;
	private int level;
	private int experience;
	
	private String description;
	
	//Can set and get name of object
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	//Can set and get hp of object
	public void setHp(int health) {
		hp = health;
	}
	
	public int getHp() {
		return hp;
	}
	
	//Can set and get level of object
	public void setLevel(int l) {
		level = l;
	}
	
	public int getLevel() {
		return level;
	}
	
	//Can set and get experience of object
	public void setExperience(int exp) {
		experience = exp;
	}
	
	public int getExperience() {
		return experience;
	}
	
	//Can set and get description of object
	public void setDescription(String d) {
		description = d;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract void interact();
	
	public abstract void attack();
	
	public abstract void takeDamage();
	
	public abstract void evasion();
	
	//actually means death
	public abstract void yamcha();
}
