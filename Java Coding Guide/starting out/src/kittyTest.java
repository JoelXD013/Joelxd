import java.util.Scanner;

public class kittyTest {

	//Testing out Kitty in different file and not worrying about errors until later.
	public static void main(String[] args) {
		System.out.print("Name of kitty: ");
		Scanner in = new Scanner(System.in);
		String n = in.nextLine(); //Obtains name for Kitty as input.
		
		System.out.println();
		
		System.out.print("Age of kitty: ");
		int a = in.nextInt(); //Obtains age for Kitty as input.
		
		System.out.println();
		
		System.out.print("Weight of kitty: ");
		int w = in.nextInt(); //Obtains weight for Kitty as input.
		
		in.close(); //Make sure you close to prevent resource leak.
		
		System.out.println();
		
		//Create new object "Kitty"
		Kitty myKitty = new Kitty(n);
		myKitty.reName("Moses"); //Used this function for fun.
		
		System.out.println();
		
		myKitty.setAge(a);
		myKitty.setWeight(w);
		
		System.out.println(myKitty.getName() + "'s age is "    + myKitty.getAge());
		System.out.println();
		System.out.println(myKitty.getName() + "'s weight is " + myKitty.getWeight());
	}

}
