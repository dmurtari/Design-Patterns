/**
* Wall.java
*
* Walls have length and height, and start and end coordinates in the simulation
*/

import java.lang.Math;

public class Wall implements SimulationElement{

  private double x0;
	private double y0;
	private double x1;
	private double y1;
	private int id;
	private double length;
	private double height;
	
	public Wall(int id, double x0, double x1, double y0, double y1, double height)
	{
	  this.x0 = x0;
		this.y0 = y0;
	  this.x1 = x1;
		this.y1 = y1;
	  this.height = height;
		this.length = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
		this.id = id;
	}
	
	public double getHeight(){ return height; }
	public double getLength(){ return length; }
	public int getId(){ return id; }

	public void accept(SimulationVisitor visitor){
		visitor.visit(this);
	}
		
}