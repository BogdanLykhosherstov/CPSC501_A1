package Farm;

import java.util.ArrayList;

public class Cow extends Animal {
    public Cow(int age, int weight){
        super(age, weight,"Cow");
    }

    // 6. Duplicate Code in Sibling Classes - pull up method into Animal
    public void cowSound(){
        System.out.println("Moo!");
    }

    public void eatFood(String food){
        if(food.equals("Grass")){
            cowSound();
            System.out.println("Thanks!");
            this.isHungry = false;
        }
        else{
            System.out.println("*Angry Moo* 'I can't eat that!'");
        }

    }
//   2. Primitive Obsession - extract into an object or a class
    public ArrayList<Object> makeMilk(int numberOfLitres, String type, String fatContent, boolean isChocolateMilk){
        ArrayList<Object> milk = new ArrayList<>();
        if(numberOfLitres>0){
            milk.add(numberOfLitres);
        }
        else{
            System.out.println("Uh oh. Try making milk again!");
        }
        milk.add(type);
        milk.add(fatContent);
        milk.add(isChocolateMilk);
        return milk;
    }
}
