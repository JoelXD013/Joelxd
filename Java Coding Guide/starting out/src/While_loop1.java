
public class While_loop1 {
	
	//int function that calculates sum of numbers using loop
	static int sum(int n, int sum) {
		int i = 0;
		while (i <= n) {
			sum += i; //sum3 = sum3 + i
			i++;
		}
		return sum;
	}
	
	public static void main(String args []) {
		int n = 10;
		int sum = 0;
		
		int i = 1; //Since it is a sum calculation, setting the value to 1 or 0 doesn't matter.
		System.out.print("0"); //To make it print pretty
		
		//Adding sum of 0+1+2+3+4+5+6+7+8+9+10
		//O(n) = n
		while (i <= n) {
			sum = sum + i;
			System.out.print("+" + i);
			i++;
		}
		System.out.println("=" + sum);
		
		System.out.println();
		
		//using a known algorithm instead of a loop to save on execution time
		int sum2 = 0;
		n = 10;
		//O(n) = 1 
		sum2 = (n * (n + 1)) / 2;
		System.out.println("Sum = " + sum2);
		
		System.out.println();
		
		//using loops in a function and calling that function several times
		int sum3 = 0;
		n = 10;
		
		sum3 = sum(n, sum3);
		System.out.println("Sum = " + sum3);
		
		n = 5;
		sum3 = 0; //need to set sum back to 0, it doesn't use previous sum value
		sum3 = sum(n, sum3);
		System.out.println("Sum = " + sum3);
		
		n = 2;
		sum3 = 0;
		sum3 = sum(n, sum3);
		System.out.println("Sum = " + sum3);
		
		n = 72;
		sum3 = 0;
		sum3 = sum(n, sum3);
		System.out.println("Sum = " + sum3);
		
		System.out.println();
		
		//Using boolean variable in while loop
		boolean check = true;
		int j = 0;
		//O(n) = n
		while (check) {
			if (j == n) {
				System.out.println(j);
				check = false;
			}
			j++;
		}	
	}
}
