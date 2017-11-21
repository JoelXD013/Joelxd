import java.util.Scanner;
public class factorial {
	static int problem(int n) {
		int q=1;
		int a = 1;
		while (q<=n) {
			a*=q;
			q++;
		}
		return a;
			
	}
	
	public static void main(String[] args) {
		System.out.println("Type out factorial: ");
		Scanner input = new Scanner (System.in);
		int factorial = input.nextInt();
		System.out.println (problem(factorial));
}
}