/**
* GamePlayer.java
*
* A simple game player class
*/

public class GamePlayer
{
   Context context;

   public void setup(int boardSize, int moveSelectionTime)
   {
      if (boardSize < 20) {
         context = new Context(new TreeSearch());
      } else if (boardSize >= 20 && moveSelectionTime >= 60) {
         context = new Context(new Minimax());
      } else {
         context = new Context(new MonteCarlo());
      }
   }

   public void selectMove()
   {
      context.executeStrategy();
   }
}
	