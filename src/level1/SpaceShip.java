package level1;

public class SpaceShip {
	
	
String pilot ;
int fuel = 0;


SpaceShip(String pilot, int fuel){
	this.pilot = pilot;
	this.fuel= fuel;
	System.out.println("creating space ship");
}


 void refuel(int fuel){
	fuel += 10;
	this.fuel = fuel;
 }
 void launch(){
	 if(fuel <= 0){
		 System.out.println("ERROR ERROR!! Low fuel can not launch space craft");
	 }
	 else
	 {
		 fuel =- 5;
		 System.out.println("The space craft will be commanded by " + pilot );
	 }

 }
 
	
}
