/**
* Flower.java
*
* Decorator to make character that has a flower
*/

public class Flower extends CharacterDecorator{

  public Flower(Character baseCharacter){
    super(baseCharacter);
  }

  @Override
  public void draw(){
    super.draw();
    giveFlower();
  }

  public void giveFlower(){
    System.out.println("And I can throw fireballs!");
  }
}