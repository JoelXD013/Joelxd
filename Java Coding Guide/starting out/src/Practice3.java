
public class Practice3 {
	
	public static void main(String[] args) {
		int a = 46;
		
		if (a>50) {
			System.out.println("Hello");
			}
		else {System.out.println("Bye");
			if (a<40) {
				System.out.println("Nevermind");
			}
			else System.out.println("See ya");
			}
		ex1("Name");
		int sum = ex2(120,3);
		int res = sum * 2;
		System.out.println(res);
		}
		public static void ex1(String n) {
			System.out.println("Hi "+ n);
		}
		public static int ex2 (int b, int c) {
			//System.out.println(c+b);
			return(c+b);
		}
	}


