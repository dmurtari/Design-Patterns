/**
* Star.java
*
* Decorator to make character that has a star
*/

public class Star extends CharacterDecorator{

  public Star(Character baseCharacter){
    super(baseCharacter);
  }

  @Override
  public void draw(){
    super.draw();
    giveStar();
  }

  public void giveStar(){
    System.out.println("And I can throw fireballs!");
  }
}