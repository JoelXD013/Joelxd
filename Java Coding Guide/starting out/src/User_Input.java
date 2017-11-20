import java.util.Scanner;

public class User_Input {

	public static void main(String args []) {
		Scanner move = new Scanner (System.in);
		System.out.println(move.nextLine());
		
		Scanner input = new Scanner (System.in);
		System.out.println("How old are you?");
		int users_age = input.nextInt();
		
		System.out.println("The users age is " + users_age);
				
		Scanner input2 = new Scanner (System.in);
		System.out.println("How old are you using decimals for months?");
		double users_age2 = input2.nextDouble();
		
		System.out.println("The users age is " + users_age2);
	}
	

}
