
public class AnimalCounterApp {

	public static void main(String[] args) {
		
		Animal an = new Animal();

		System.out.println();

		Alligator ga = new Alligator();
		System.out.println("Counting alligators...");		
		resetCountAndCountAgain(ga,3); //pass alligator + 3
		
		System.out.println();

		Sheep sh = new Sheep();
		System.out.println("Counting sheep...");		
		sh.setName("sheep...");
		sh.setName("Blackie");
		resetCountAndCountAgain(sh,2); //pass sheep + 2
		System.out.println();
		
		//Clone sheep
		try {
			Sheep sh2 = (Sheep) sh.clone();
			sh2.setCount(3);
			sh2.setName("Dolly");
			resetCountAndCountAgain(sh2,3); //pass cloned sheep + 3
		} catch (Exception e){
			System.out.println("Exception: " + e);			
		}		
		
		System.out.println();

		//Sheep again
		sh.setName("Blackie");
		resetCountAndCountAgain(sh,1); //pass sheep + 2
		System.out.println();
	}
	
	public static void count(Countable c, int maxCount) {
		int count = 0;
		for(int i=0;i<maxCount;i++) {
			c.IncrementCount();
			System.out.println(c.getCountString());			
		}
	}
	
	public static void resetCountAndCountAgain(Countable c, int maxCount) {
		c.ResetCount();
		count(c, maxCount);
	}
	
}