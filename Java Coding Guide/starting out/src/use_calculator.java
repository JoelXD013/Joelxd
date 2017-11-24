import java.util.Scanner;

public class use_calculator {
	public static void main(String[] args) {
		calculator calc = new calculator();
		
		double a;
		double b;
		char oper = ' ';
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("To exit calculator type 0 0 0");
		
		while (oper != '0') {
			System.out.print("Type in what you want to calculate, ex. '5 + 3': ");
			a = input.nextDouble();
			oper = input.next().charAt(0);
			b = input.nextDouble();
			
			switch(oper) {
			case '+':
				System.out.println("Sum: " + calc.sum(a, b));
				break; 
			case '-':
				System.out.println("Difference: " + calc.dif(a, b));
				break;
			case '*':
				System.out.println("Product: " + calc.pro(a, b));
				break;
			case '/':
				System.out.println("Quotient: " + calc.quo(a, b));
				break;
			case '^':
				System.out.println("Exponent: " + calc.exp(a, b));
				break;
			case '0':
				System.out.println("Now exiting calculator.");
				break;
			default:
				System.out.println("Please type in valid input.");
				break;
			}
		}
		input.close();
	}
}