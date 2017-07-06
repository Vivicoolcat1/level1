package level1;

public class SmurfsRunner  {
	public static void main(String[] args) {
		
	
Smurf handy = new Smurf("Handy");
Smurf papa = new Smurf("Papa");
Smurf smurfette = new Smurf ("Smurfette");
handy.eat();
handy.getName();
System.out.println(papa.getName());
System.out.println(papa.getHatColor());
System.out.println(smurfette.getName());
System.out.println(smurfette.isGirlOrBoy());

	}
}
