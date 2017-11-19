
public class if_else {

	
	public static void main (String args[]) {
		String game = "Kingdom Hearts";
		if (game == "Kingdom Hearts")	
			System.out.println(" is the best game");
		else
			System.out.println(" is not the best game");
	
		int hp, d, a, life;
	
		hp = 2000;
		d = 300;
		a = 2500;
		
		if (a<d) {
			a=0; 
			d=0;
		}
		life = hp + d - a;
		boolean alive;
		
		if (life <= 0) {
			alive = false;
			System.out.println("dead");
		}
		else {
			System.out.println("HP: " + life);
			alive = true;
		}
		
		
		if (!alive) {
			System.out.println("Uninstall.");
		}
		else System.out.println("You will uninstall, eventually.");
		
		System.out.println();
		char first_letter = '9';
		char second_letter = 'a';
		
		if (first_letter > second_letter) //can compare "char" variables, but cannot compare "string" variable
			System.out.println(first_letter + ">" + second_letter);
		else System.out.println(first_letter + "<" + second_letter);
		
		//Ex. if ( (car == "toyota_corola" && money >= 40000) && needs_car == true) get_car();
		
		int x, y;
		int begin = 0; //horizontal row from 0 to 7
		int end = 7;
	
		x = -2;
		y = 7;
		
		if ((x < begin || x > end) || (y < begin || y > end)) {
			System.out.println("Out of bounds");
		}
		else System.out.println("Valid move!");
		
		System.out.println();
		int first_number  = 7;
		int second_number = 7;
		
		if (first_number < second_number) {
			System.out.println(first_number + " < " + second_number);
		}
		else if (first_number > second_number) {
			System.out.println(first_number + " > " + second_number);
		}
		else System.out.println(first_number + " = " + second_number);
	}
	
}