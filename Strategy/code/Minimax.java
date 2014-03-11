/**
* Minimax.java
*
* Minimax player
*/

public class Minimax implements Strategy{

   public String strategy;

   public Minimax() {
      strategy = "Minimax";
   }

   public void execute() {
      System.out.println("I'm making a move using " + strategy + " AI");
   }
}
