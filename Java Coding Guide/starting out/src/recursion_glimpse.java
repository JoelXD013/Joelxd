import java.util.Scanner;
public class recursion_glimpse {
	
  /*sum (5, 0)
	sum (5 – 1, 0 + 5)   = sum(4,5)
	sum (4 – 1, 5 + 4)   = sum(3,9)
	sum (3 – 1, 9 + 3)   = sum(2,12)
	sum (2 – 1, 12 + 2)  = sum(1,14)
	sum (1 – 1, 14 + 1)  = sum(0,15)
	15
	*/
	static int sum(int n, int sum) {
		if (n == 0)
			return sum;
		return sum(n - 1, sum + n);
	}

	public static void main(String[] args) {
		int numbers;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Type the amount of numbers you want to go to in the summation series: ");
		numbers = in.nextInt();
		in.close();
		
		System.out.println("Sum: " + sum(numbers,sum));

	}

}
