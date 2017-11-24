
public class arrays1 {

	public static void main(String[] args) {
		//2 ways of declaring array
		int first_numbers[];
		int[] second_numbers; 
		                          //0  1  2  3  4
		first_numbers  = new int[] {23,42,19,19,37}; //size of 5 array
		second_numbers = new int[5]; //size of 5 array, but no values were defined inside
		
		System.out.println(first_numbers[0]);
		System.out.println(second_numbers[0]); //second numbers has {0,0,0,0,0} as of right now
		
		second_numbers = first_numbers; //can set arrays equal to each other's memory address. second numbers has {23,42,19,19,37} as of right now
		System.out.println(second_numbers[0]);
		
		second_numbers[0] = 4;
		System.out.println(second_numbers[0]); // first_numbers and second_numbers has {4,42,19,19,37} as of right now
		System.out.println(first_numbers[0]);
		
		System.out.println();
		int i;
		for(i = 0; i < first_numbers.length; i++ )
			System.out.print(first_numbers[i] + " ");
		
		System.out.println();
		System.out.println();
	
		//a proper way to copy an array without editing the values of the first array
		int third_numbers[] = new int[10]; //Can declare array and allocate memory (instantiate) (define) to it at the same time.
		
		for(i = 0; i < first_numbers.length; i++) {
			third_numbers[i] = first_numbers[i];
			System.out.print(third_numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		third_numbers[0] = 10;
		System.out.println(third_numbers[0]);
		System.out.println(first_numbers[0]); //does not edit values of first array since we didn't link up their memory
		
	}

}
