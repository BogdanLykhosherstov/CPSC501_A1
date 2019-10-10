package Farm;

public class Farm {
    public static void main(String[] args) {

//      Create 1 of each animal
        Cow moo = new Cow(12,100);
        Pig oink = new Pig(8,90);
        Animal woof = new Animal (5,60,"Dog");
//      Produce their sound
        moo.makeSound();
        oink.makeSound();
        woof.makeSound();

    }
}
