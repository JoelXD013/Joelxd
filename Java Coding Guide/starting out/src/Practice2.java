import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		//Practice_Multi_Class ob = new Practice_Multi_Class ();
		//ob.mess();

		Scanner input = new Scanner(System.in);
		//Practice_Multi_Class myName = new Practice_Multi_Class (); //myName can now pull from multi class
		
		
		//System.out.println("Enter your name");
		//String name = input.nextLine();
		
		
		//myName.sim(name);
		
		//System.out.println();
		
		Practice_Multi_Class theName = new Practice_Multi_Class ();
		System.out.println("Enter the name: ");
		String temp = input.nextLine();
		theName.setName(temp);
		theName.say();
		input.close();
	}

}
