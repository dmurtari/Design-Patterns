/**
* Robot.java
*
* Robots have positions in the simulation
*/


public class Robot implements SimulationElement {
	
  private double x;
	private double y;
	private int id;
	
	public Robot(int id, double x, double y)
	{
	  this.x = x;
		this.y = y;
		this.id = id;
	}

	public double getX(){ return x; }
	public double getY(){ return y; }
	public int getId(){ return id; }

	public void accept(SimulationVisitor visitor){
		visitor.visit(this);
	}		


}