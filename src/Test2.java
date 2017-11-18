
public class Test2 {
	public static void main (String args[]) {
		int a, b, c, d;
		
		a = 78;
		b = 56;
		c = a - b;
		
		System.out.println("The difference of " + a + " and " + b + " is " + c +".");
		System.out.println();
		
		double x = 45.63; 
		double exponent;
		
		exponent = Math.pow(x,3);
		
		System.out.println(exponent);
		
		c = a + b;
		
		System.out.println(c);
		
		System.out.println("Let's learn modulus: ");
		System.out.println();
		
		a = 69;
		b = 2;
		
		c = a % b;
		
		System.out.println("The mod of " + a + " and " + b + " = " + c);
		
		if (c == 0) {
			System.out.println("It is even.");
			System.out.println("It is divisible by 2");
		}
		else { 
			System.out.println("It is odd.");
			System.out.println("It is not divisible by 2.");
		}
		
		a = 6;
		b = 2;
		c = a/b;
		d = c*a;
		System.out.println();
		System.out.println(c);
		System.out.println(d);
		
		a = 16;
		a += 1; //means the same thing as "a = a + 1"
		
		System.out.println();
		System.out.println("To add to itself: " + a );
		System.out.println();
		
		int i = 0;
		i++; //increments i
		System.out.println("i = " + i);
		
		i--; //decrements i
		System.out.println("i = " + i);
	}
}
