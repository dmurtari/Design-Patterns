/**
* Logger.java
*
* Logger objects are used to log data from objects in a simulation
*/

public class Logger
{

	public Arena arena = null;
	public Robot robot = null;
	public Wall wall = null;
	
	public Logger(Arena arena, Robot robot, Wall wall)
	{
	  this.arena = arena;
	  this.robot = robot;
	  this.wall = wall;
	}
	
	public void logData()
	{
		arena.accept(new ConcreteVisitor());
		robot.accept(new ConcreteVisitor());
		wall.accept(new ConcreteVisitor());
	}
}