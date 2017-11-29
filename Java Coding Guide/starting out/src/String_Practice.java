
public class String_Practice {

	public static void main(String[] args) {
		String test = "Hello Practice"; //String is an array of characters
		int test_length = test.length();
		String test2 = test.toLowerCase(); //converts all characters to lower case
		System.out.println(test_length);
		System.out.println(test2);
		String test3 = test.toUpperCase(); //converts all characters to upper case
		System.out.println(test3);
		System.out.println(test.replace("e", "a")); //replaces all instances of the first
													//character(s) with the second character(s)
		System.out.println();
		System.out.println(test.indexOf("H")); //finds where in string array a character is first located
		
	}

}
