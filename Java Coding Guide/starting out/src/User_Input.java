import java.util.Scanner;

public class User_Input {

	public static void main(String args []) {
	
		//Don't need to define multiple scanners, but you can if you want to.
		Scanner move = new Scanner (System.in);
		System.out.println(move.nextLine());
		move.close(); //Make sure you close to prevent resource leak.
		
		Scanner input = new Scanner (System.in);
		System.out.println("How old are you?");
		int users_age = input.nextInt();
		input.close(); //Make sure you close to prevent resource leak.
		
		System.out.println("The users age is " + users_age);
				
		Scanner input2 = new Scanner (System.in);
		System.out.println("How old are you using decimals for months?");
		double users_age2 = input2.nextDouble();
		input2.close(); //Make sure you close to prevent resource leak.
		
		System.out.println("The users age is " + users_age2);
	}
	

}
