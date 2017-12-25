package inheritance2;

public class Testing_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakableObject barrel = new BreakableObject("Barrel", 250, 10);
		
		System.out.println(barrel.getName());
		System.out.println(barrel.getHp());
		System.out.println(barrel.getExperience());
		
		barrel.interact();
		
		System.out.println(barrel.getName());
		System.out.println(barrel.getHp());
		System.out.println(barrel.getExperience());
	}

}
