package level1;

public class Cat {
	 
	private String name;
	private int pets = 9;
 
	Cat(String name) {
		this.name = name;
	}
 
	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}
 
	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}
 
	void pet() {
		pets--;
		if (pets > 0)
			System.out.println("nice try, but I still have " + pets + " pets left");
		else if (pets < 0)
			System.out.println("that's over petting yo!");
		else
			System.out.println("PURING CAT :)");
		
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
 Cat lucy = new Cat("Bex");
		// 1. Make the Cat meow
		lucy.meow();
		// 2. Get the Cat to print it's name
 lucy.printName();
		// 3. pet the Cat!
 for (int i = 0; i < 9; i++) {
	

 lucy.pet();
 }
	}
}
 
 
