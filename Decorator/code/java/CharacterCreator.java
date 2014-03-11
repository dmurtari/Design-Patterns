/**
* CharacterCreator.java
*
* Creates characters using the decorator
*/
 
public class CharacterCreator{

  public static void main(String[] args){

    Character fancyCharacter = new Tall(new Flower(new PlainCharacter()));
    fancyCharacter.draw();

  }

}