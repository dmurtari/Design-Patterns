/**
* Tall.java
*
* Decorator to make tall character
*/

public class Tall extends CharacterDecorator{

  public Tall(Character baseCharacter){
    super(baseCharacter);
  }

  @Override
  public void draw(){
    super.draw();
    System.out.println("I'm tall!");
  }

}