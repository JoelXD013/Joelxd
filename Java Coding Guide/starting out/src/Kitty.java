
public class Kitty {
	int age;
	int weight;
	String name;
	//boolean adorable;
	
	public Kitty(String n) {
		name = n;
		System.out.println("Name is: " + name); //not needed, but you can do it
	}
	
	public void reName(String n) {
		name = n;
		System.out.println("New name is: " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public static void main(String []args) {
		//Creating object
		Kitty myKitty = new Kitty("Luna");
		Kitty frankKitty = new Kitty("Moses");
		
		System.out.println();
		
		//Setting age for object
		myKitty.setAge(1);
		frankKitty.setAge(12);
		
		//Setting weight for object
		myKitty.setWeight(15);
		frankKitty.setWeight(12);
		
		//Obtaining name from object and then printing the object's age
		System.out.println(myKitty.getName()    + "'s age is " + myKitty.getAge());
		System.out.println(frankKitty.getName() + "'s age is " + frankKitty.getAge());
	
		System.out.println();
		
		//Obtaining name from object and then printing the object's weight
		System.out.println(myKitty.getName()    + "'s weight is " + myKitty.getWeight());
		System.out.println(frankKitty.getName() + "'s weight is " + frankKitty.getWeight());
	}
}
