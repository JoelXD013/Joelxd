import java.util.Arrays;

public class Library {
	String[] books;
	int c_length;
	
	//constructor
	public Library (int n) {
		c_length = 0;
		books = new String[n];
		
	}
	//add
	public void add(String x) {
		if (c_length == 0) { 
			books[c_length] = x;
			c_length++;
		}
		else if (c_length < books.length) {
			if (check_name(x)) {
				System.out.println("The name " + x + " exists");
			} 
			else {
				books[c_length] = x; 
				c_length++;
				//System.out.println("The name, " + x + ", has been added to the array.");
			}
		}
		else System.out.println("The array is full of names and cannot be exceeded.");
	
	}
	
	//delete with index
	public void del_with_index(String x) {
		if (c_length == 0)
			System.out.println("There are not any books in the library.");
		else {
			int element_var = find_element_array(x);
			if(element_var != -1) {
				int j = element_var;
				while (j < books.length - 1) {
					books[j] = books[j+1];
					j++;
				}
				books[j] = null;
				c_length--;
				
				System.out.println("The name, " + x + ", has been deleted from array.");
			}
			else {
				System.out.println("There is no element in the array with the name you entered.");
			}
		}
	}
	//delete last book
	public String del_last_book() {
		if (c_length == 0) {
			System.out.println("There are not any books in the library.");
			return null;
		}
		else {
			String temp = books[c_length - 1];
			books[c_length - 1] = null;
			c_length--;
			//System.out.println("This stuff: " + temp);
			return temp;
		}
	}
	
	//find
	public int find_element_array(String name) {
		for(int i = 0; i < c_length; i++) {
			if (books[i].equals(name))
				return i;
		}
		return -1;
	}
	
	//check name
	public boolean check_name(String name) {
		for (int i = 0; i < c_length; i++) {
			if (books[i].equals(name))
				return true;
		}
		return false;
	}
	
	//print 
	public void print_array() {
		System.out.println("Please read the following names you inputed for clarity: ");
		for(int i = 0; i < c_length; i++)
			System.out.println(books[i]);
	}
	
	//clears array
	public void clear_array() {
		Arrays.fill(books,null);
		c_length = 0;
		
	}
}
