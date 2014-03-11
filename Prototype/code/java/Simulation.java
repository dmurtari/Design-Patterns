/** 
* Simulation.java
*
* Demonstrates the functionality of the Neural Network's learning
*/

public class Simulation{

  public static void main(String[] args){
    
    Network network = new NeuralNetwork();
    Network clone = null;

    network.learn();
    network.learn();
    network.learn();

    clone = (NeuralNetwork) network.clone();

    double originalResult = network.respond();
    double cloneResult = clone.respond();

    System.out.println("Original's network value is " + originalResult);
    System.out.println("Clone's network value is " + cloneResult);

  }

}