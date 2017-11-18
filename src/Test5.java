
public class Test5 {
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	static String ret(String nam, String b) {
		b = nam; // sets it equal to "Joe"
		return b; 
	}

	static boolean best_game(String game_name) {
		if (game_name == "Kingdom Hearts")
			return true;
		return false;
	}
	
	static void abyss() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ABYSS");
	}
	
	static void the_void_mod(int a, int b, int result) {
		result = a % b;
		System.out.println(result); //changed the local variable "result" but not the "result" in the main function
	}
	
	public static void main(String[] args) {
		//int function
		int x = 2;
		int y = 8;
		System.out.println(sum(2,8));
		
		//string function
		String nam = "Joe";
		String b = "x";
		System.out.println(ret(nam,b));
		
		//boolean function
		boolean da_best;
		String game;
		game = "Kingdom Hearts";
		
		da_best = best_game(game);
		if (da_best)
			System.out.println(game + " is da best game!");
		else System.out.println(game + " is not da best game!");
		
		//void function
		abyss();
		abyss();
		
		//void function with parameters (flawed Example)
		x = 19;
		y = 2;
		int result = 0;
		
		the_void_mod(x,y,result); //Function parameters can only except values
		System.out.println(result); //"result" variable not changed from void function
	}
	
	
}
