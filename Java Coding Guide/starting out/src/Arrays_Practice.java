
public class Arrays_Practice {

	public static void main(String[] args) {
		int[] ar = {2,5,7,3,5}; //one way
		
		int ar2[] = {3,7,78,46,9}; //another way
		
		int[] ar3 = new int [3]; //other way
		
		int[] ar4 = new int [] {6,8,1}; //other way
		
		int ex = 0;
		while (ex<5) { //can't go over the size of the array 
		System.out.println(ar2[ex]);
		ex++;
		
		}
		System.out.println();
		for (ex = 0; ex<3; ex++) {
		System.out.println(ar4[ex]);
			
		}
		System.out.println();
		for (int el: ar) {
			System.out.println(el); //can print out array
			
		}
	}

}
