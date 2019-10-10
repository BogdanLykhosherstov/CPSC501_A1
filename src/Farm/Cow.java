package Farm;

public class Cow extends Animal {
    public Cow(int age, int weight){
        super(age, weight,"Cow");
    }

    public Milk makeMilk(int numberOfLitres, String type, String fatContent, boolean isChocolateMilk){

        Milk milkObject = null;
        if(numberOfLitres>0){
            milkObject = new Milk(numberOfLitres, type, fatContent,isChocolateMilk);
        }
        else{
            System.out.println("Uh oh. Try making milk again!");
        }

        return milkObject;
    }
}
