
public class Practice_Multi_Class {
	/*public void mess () {
		System.out.println("Test");
	}
	
	public void sim(String name) {
		System.out.println("Hello " + name);

	}*/
	
	private String name2; //private means it can only be used in this class
	public void setName(String theName) {
		name2 = theName;
		
	}
	//public Practice_Multi_Class (String theName) { //Constructor created to initialize variables not necessary here though
		//name2 = theName;							// Useful for storing multiple names or variables when creating multiple objects
		
	//}
	public String getName () {
		return name2;
		
	}
	public void say() {
		System.out.printf("The name is %s", getName()); //the %s will be replaced by whatever string
														//is enter after the comma
		
	}
}
