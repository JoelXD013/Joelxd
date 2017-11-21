
public class Switch_statements {

	public static void main(String[] args) {
		int age;
		age = 20;
		
		switch (age) { //can enter a byte, short, int, or char
		case 16:
			System.out.println("Can now drive");
			break; //if one wanted the same command for multiple values, one would just not need to enter a break until all case values were entered
		case 18: 
			System.out.println("Can now smoke");
			break;
		case 21:
			System.out.println("Can buy alcohol");
			break;
		default:
			System.out.println("Regular birthday");
			break;
		}
	}

}
