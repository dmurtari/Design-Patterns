/**
* Network.java
*
* Interface to the NeuralNetwork object
*/

public interface Network extends Cloneable{
   
   public NeuralNetwork clone();
   public void learn();
   public double respond();

}