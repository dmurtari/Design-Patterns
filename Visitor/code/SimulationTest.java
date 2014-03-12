/**
* SimulationTest.java
*
* Test the Simulation
*/

public class SimulationTest{

  public static void main(String[] args){

    Arena arena = new Arena(1, 5);
    Robot robot = new Robot(2, 2, 3);
    Wall wall = new Wall(3, 0, 10, 0, 10, 10);
    Logger logger = new Logger(arena, robot, wall);

    logger.logData();

  }

}