package Project_Euler;

public class Problem_1 {

	public static void main(String[] args) {
		int sum = 0;
		int t = 0;
		
		// can compare number % 2 == 0
		while (t<1000) {
			if (t%5==0) {
				sum=sum + t;
				t++;
			}
			else if (t%3==0) {
				sum=sum+t;
				t++;
			}
			else t++;
		}
		System.out.println(sum);;
	}

}
