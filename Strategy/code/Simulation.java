/**
* Simulation.java
*
* Tests the simulation
*/

public class Simulation {

   public static void main(String[] args) {
      GamePlayer player1 = new GamePlayer();
      player1.setup(15, 70);
      player1.selectMove();
      GamePlayer player2 = new GamePlayer();
      player2.setup(20, 70);
      player2.selectMove();
      GamePlayer player3 = new GamePlayer();
      player3.setup(25, 50);
      player3.selectMove();
   }
}
