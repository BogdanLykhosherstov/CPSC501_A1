package Farm;

public class Pig extends Animal{

    public boolean isBowlEmpty() {
        return isBowlEmpty;
    }

    private boolean isBowlEmpty = false;

    public Pig(int age, int weight){
        super(age, weight,"Pig");
    }

    public void checkEmptyBowl() {
        if (!isBowlEmpty) {
            isBowlEmpty = true;
        }
    }

    @Override
    public String eatFood(String food){
        checkEmptyBowl();
        return super.eatFood(food);
    }



    public void playInDirt(){
        //must finish eating first before playing
        checkEmptyBowl();
        System.out.println("Oink! Im playing in the dirt");

    }
}
