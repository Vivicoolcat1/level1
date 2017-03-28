package level1;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class introToGridworld {
public static void main(String[] args) {
	World Mars = new World();
	Mars.show();
	
	Flower a = new Flower(Color.RED);
	for (int j = 0; j <= 9; j++) {
		Mars.add(new Location(0,j), a);	
		Mars.add(new Location(1,j), a);	
	}
	Flower b = new Flower(Color.ORANGE);
	for (int j = 0; j <= 9; j++) {
		Mars.add(new Location(2,j), b);	
		Mars.add(new Location(3,j), b);	
	}
	Flower c = new Flower(Color.YELLOW);
	for (int j = 0; j <= 9; j++) {
		Mars.add(new Location(4,j), c);	
		Mars.add(new Location(5,j), c);	
	}
	Flower d = new Flower(Color.GREEN);
	for (int j = 0; j <= 9; j++) {
		Mars.add(new Location(6,j), d);	
		Mars.add(new Location(7,j), d);	
	}
}
}
