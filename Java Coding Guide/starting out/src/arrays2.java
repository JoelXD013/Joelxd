import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {

	static void print_array(String[] n) {
		System.out.println("Please read the following names you inputed for clarity: ");
		for(int i = 0; i < n.length; i++)
			System.out.println(n[i]);
	}
	
	//Finds the element in the array using a name  and length (not size) of array as a reference
	static int find_element_array(String[] n, String name, int c_length) {
		for(int i = 0; i < c_length; i++) {
			if (n[i].equals(name)) //Can't use "n[i] == name", since it doesn't actually compare the strings
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int n = 3;
		String[] names = new String[n]; //String arrays default value is "null".
		int content_length = 0;
		
		int i = 0;
		Scanner in = new Scanner(System.in);
		String temp;
		
		
		//Accepts input to add to array
		while (i < n) {
			if (i == (n - 1)) 
				System.out.print("Last name to type: ");
			else System.out.print("Please type a name: ");
			
			temp = in.nextLine();
			
			if (content_length == 0) { 
				names[i] = temp;
				content_length++;
				i++;
			}
			else if(find_element_array(names,temp,content_length) != -1) {
				System.out.println("This name already exists.");
			}
			else {
				names[i] = temp;
				content_length++;
				i++;
			}
		}
		System.out.println();
		
		print_array(names);
		System.out.println();
		
		
		//Finds element in array
		System.out.print("Please type in valid name to find where it is in the array: ");
		temp = in.nextLine();
		System.out.println();
		
		int element_var = find_element_array(names,temp,content_length);
		if(element_var != -1)
			System.out.println("It is placed in element " + element_var + ".");
		else
			System.out.println("There is no element in the array with the name you entered.");
		
		System.out.println();
		
		
		//Deletes element from an array and then organizes it
		System.out.print("Please type in the name you want to delete from the array: ");
		temp = in.nextLine();
		System.out.println();
		
		element_var = find_element_array(names,temp,content_length);
		if(element_var != -1) {
			int j = element_var;
			while (j < names.length - 1) {
				names[j] = names[j+1];
				j++;
			}
			names[j] = null;
			content_length--;
			
			System.out.println("The name, " + temp + ", has been deleted from array.");
			System.out.println();
			print_array(names);
		}
		else {
			System.out.println("There is no element in the array with the name you entered.");
			System.out.println();
			print_array(names);
		}
		
		
		//Add a name to array using user input
		System.out.println();
		System.out.println("Length: " + content_length);
		System.out.println("Size of array: " + names.length); //The content_length is different from the size of the array.
		System.out.println();
		
		if (content_length < names.length) {
			System.out.print("Enter the new name you want to add to the array: ")	;
			temp = in.nextLine();
			System.out.println();
			
			names[content_length] = temp; //Content_length makes it easier to track what is the first variable equal to "null" in array.
			content_length++;
			
			System.out.println("The name, " + temp + ", has been added to the array.");
			System.out.println();
			print_array(names);
		}	
		else System.out.println("The array is full of names and cannot be exceeded.");
		
		 in.close();
		 System.out.println();
		 
		 //clears out array by setting every value in element to "null"
		 Arrays.fill(names,null);
		 print_array(names);
		 
	}

}
