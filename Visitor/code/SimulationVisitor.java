/**
* SimulationVisitor.java
*
* Interface for all visitable classes. Enforces that they implement a visit
* method
*/

public interface SimulationVisitor{

  public void visit(Arena arena);
  public void visit(Robot robot);
  public void visit(Wall wall);

}