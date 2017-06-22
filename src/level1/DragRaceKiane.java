
	package Assignments;

	import java.io.IOException;

	import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
	import org.jointheleague.ecolban.rpirobot.IRobotInterface;
	import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

	public class DragRaceKiane  extends IRobotAdapter {
		//Sonar sonar = new Sonar();
		
		public DragRaceKiane(IRobotInterface iRobot) {
			super(iRobot);
		}

		public static void main(String[] args) throws Exception {
			System.out.println("Try event listner, rev Monday 2030");
			IRobotInterface base = new SimpleIRobot();
			DragRaceKiane rob = new DragRaceKiane(base);
			rob.setup();
			while(rob.loop()){}
			rob.shutDown();
			
		}

		
		
		private void setup() throws Exception {
			//SETUP CODE GOES HERE!!!!!
		}
		
		private boolean loop() throws Exception{
			//LOOP CODE GOES HERE!!!!!
			readSensors(100);
			int[] lightBumpReadings = getLightBumps();
			
			if(lightBumpReadings[2] > 0 && lightBumpReadings [3] > 0){
				driveDirect(0, 0);				
			} else if (lightBumpReadings[4] > 0 || lightBumpReadings [5] > 0){
				driveDirect(-300, -300);
				sleep(500);
				driveDirect(-300,300);
				sleep(150);	
			} else {
				driveDirect(500, 500);
			}
			return true;
		}
		
		private void sleep(int amt){
			try {
				Thread.sleep(amt);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void shutDown() throws IOException {
			reset();
			stop();
			closeConnection();
		}
	}

