/**
* ConcreteVisitor.java
*
* Concrete implementation of the visitor
*/

public class ConcreteVisitor implements SimulationVisitor{

  public void visit(Arena arena) {
    System.out.println("Arena instance #" + arena.getId() + " has " + arena.getNumRobots() + " robots.");
  }

  public void visit(Robot robot) {
    System.out.println("Robot instance #" + robot.getId() + " is at (" + robot.getX() + ", " + robot.getY() + ")");
  }


  public void visit(Wall wall) {
    System.out.println("Arena instance #" + wall.getId() + " is " + wall.getHeight() + " tall and " + wall.getLength() + " long.");
  }
}