
public class Library_test {

	public static void main(String[] args) {
		String game = "KH";
		Library test = new Library(4);
		test.add(game);
		test.add("Party");
		test.add("for");
		test.add("ever");
		test.print_array();
		
		System.out.println();
		
		Library test2 = new Library(4);
		test2.add(test.del_last_book());
		test2.add(test.del_last_book());
		test2.add(test.del_last_book());
		test2.add(test.del_last_book());
		test2.print_array();
	}

}
