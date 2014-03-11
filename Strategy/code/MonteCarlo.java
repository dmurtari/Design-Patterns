/**
* MonteCarlo.java
*
* MonteCarlo player
*/

public class MonteCarlo implements Strategy {

   public String strategy;

   public MonteCarlo() {
      strategy = "Monte Carlo";
   }

   public void execute() {
      System.out.println("I'm making a move using " + strategy + " AI");
   }
}
