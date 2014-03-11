/**
* NeuralNetwork.java
*
* An abstract NN class.  You may extend this class to solve your problem,
* or use it as a guide, but the API must remain consistent.
*/

import java.util.Random;

public class NeuralNetwork implements Network
{
   private double weights[] = new double[4];

   public NeuralNetwork() {
      Random rand = new Random();
      for (int i = 0; i < weights.length; i++) {
         weights[i] = rand.nextInt(50);
      }
   }

   public void learn() {
      Random rand = new Random();
      for (int i = 0; i < weights.length; i++) {
         weights[i] += rand.nextDouble();
      }
   }

   public double respond() {
      double sum = 0;
      for (int i = 0; i < weights.length; i++) {
         sum += weights[i];
      }
      return sum;
   }

   public NeuralNetwork clone() {
      NeuralNetwork clone = null;
      try {
         clone = (NeuralNetwork) super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}
