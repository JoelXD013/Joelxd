//import java.lang.String;

public class manipulating_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Joseph";
		String name2 = "Frank";
		String copy = " ";
		Object number = new Object();
		number = 3;
		Object thing = new Object();
		thing = 3;

		char[] ex1 = {'a','b','c','d','e','f'};
		
		//returns character array value at specific index
		System.out.println(name.charAt(2));
		
		//Returns unicode point for specified index
		System.out.println(name.codePointAt(2));
		
		//Returns unicode point before specified index
		System.out.println(name.codePointBefore(2));
		
		//Pointless way to return the count of unicode points
		System.out.println(name.codePointCount(0,1));
		
		//Compare strings values and returns an int
		//if 0, it is equal
		//if positive, the name in parameter is greater
		//if negative, the name outside of parameter is greater
		System.out.println(name.compareTo(name2));
		
		//All upper cases are all treated like lower cases 
		System.out.println(name.compareToIgnoreCase(name2));
		
		//Similar to writing name2 + " likes cats"
		//However, concat is more efficient, since it doesn't make a new string
		//and outputs at compile time.
		System.out.println(name2.concat(" likes cats"));
		System.out.println(name2);
		
		//Checks to see if character(s) is in string if so returns true if not returns false
		System.out.println(name.contains("ose"));
		
		//checks if two strings are perfectly equal to each other
		//can accept string buffers
		System.out.println(name.contentEquals("Joseph"));
		
		//A way of copying values of a character array.
		copy = copy.copyValueOf(ex1,1,2);
		System.out.println(copy);
		
		//checks to see if the end is the specified character(s)
		System.out.println(name.endsWith("h"));
		
		//checks to see if string(or Object) is equal to an Object
		System.out.println(name.equals("Joseph"));
		System.out.println(number.equals(thing));
		
	}

}
