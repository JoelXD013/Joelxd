
public class While_Practice {

	public static void main(String[] args) {
		int ea, df, hp;
		boolean alive;
		hp=2000;
		ea=400;
		df=200;
		alive = true;
		
		while (alive) {
			if (hp <= 0) {
			alive = false;
			System.out.println("you are dead");
			}
			hp = hp + df - ea;
			System.out.println(hp);
		}
	}

}
