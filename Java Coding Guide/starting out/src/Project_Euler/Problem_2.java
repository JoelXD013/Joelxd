package Project_Euler;

public class Problem_2 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int sum = 0;
		while (n3<4000000) {
			if (n3%2==0) {
				sum = sum +n3;
				n3 = n1 + n2;
				n1=n2;
				n2 = n3;
				
				
			}
			else {
				n3 = n1 + n2;
				n1=n2;
				n2 = n3;
				
			}
			
		}
		System.out.println(sum);
	}
	
}
