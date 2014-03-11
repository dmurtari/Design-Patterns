/**
* Context.java
*
* Allows selection and execution of the strategy
*/

public class Context {

   private Strategy strategy;

   public Context(Strategy strategy) {
      this.strategy = strategy;
   }

   public void executeStrategy() {
      this.strategy.execute();
   }
}
