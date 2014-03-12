/**
* Arena.java
*
* Arenas have a certain number of robots
*/


public class Arena implements SimulationElement{

  private int numRobots;
	private int id;
	
	public Arena(int id, int numRobots)
	{
	  this.numRobots = numRobots;
		this.id = id;
	}
		
	public int getNumRobots(){ return numRobots; }
	public int getId(){ return id; }

	public void accept(SimulationVisitor visitor){
		visitor.visit(this);
	}
}