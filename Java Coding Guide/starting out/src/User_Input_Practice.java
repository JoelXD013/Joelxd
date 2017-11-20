import java.util.Scanner;

public class User_Input_Practice {
	public static void main(String args []) {
		System.out.println("Let's do some addition");
		Scanner salmon = new Scanner(System.in);
		double fir, sec, ans;
		System.out.println("Enter first number: ");
		fir = salmon.nextDouble();
		System.out.println("Enter second number: ");
		sec = salmon.nextDouble();
		ans = fir + sec;
		System.out.println("The answer is " + ans);
		
		
		
	}
}
