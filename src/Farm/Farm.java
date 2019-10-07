package Farm;

public class Farm {
    public static void main(String[] args) {

//      Create 1 of each animal
        Cow moo = new Cow(12,100);
        Pig oink = new Pig(8,90);
        Dog woof = new Dog(5,60);
//      Produce their sound
        moo.cowSound();
        oink.pigSound();
        woof.dogSound();

    }
}
