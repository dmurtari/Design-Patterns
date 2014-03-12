/**
* SimulationElement.java
*
* Forces all elements of the simulation to implement the ability to be visited
*/

interface SimulationElement{

  void accept(SimulationVisitor visitor);

}