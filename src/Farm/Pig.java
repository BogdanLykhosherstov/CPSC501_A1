package Farm;

public class Pig extends Animal{
    private boolean isBowlEmpty = false;

    public Pig(int age, int weight){
        super(age, weight,"Pig");
    }

    public void pigSound(){
        System.out.println("Oink!");
    }

    public void eatFood(String food){

        if(food.equals("Roots")){
            if(!isBowlEmpty){
                isBowlEmpty = true;
            }
            pigSound();
            System.out.println("Thanks!");
            this.isHungry = false;
            this.isBowlEmpty = false;
        }
        else{
            System.out.println("*Angry Oink* 'I can't eat that!'");
        }

    }
    // 3 - Pull up duplicate code into a new method
    public void playInDirt(){
        //must finish eating first before playing
        if(!isBowlEmpty){
            isBowlEmpty = true;
        }
        System.out.println("Oink! Im playing in the dirt");

    }
}
