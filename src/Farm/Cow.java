package Farm;

import java.util.ArrayList;

public class Cow extends Animal {
    public Cow(int age, int weight){
        super(age, weight,"Cow");
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
