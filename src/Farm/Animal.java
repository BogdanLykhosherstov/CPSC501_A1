package Farm;

public class Animal {


    private int age;
    private int weight;
    private String type;
    private boolean isHungry;
    private String whoToFollow;

    public Animal(int age, int weight, String type){
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.isHungry = false;

    }

    public String eatFood(String food){

        if(this.type.equals("Cow") && food.equals("Grass")){
            this.isHungry = false;
            return "Thanks!";
        }
        else if (this.type.equals("Pig") && food.equals("Roots")){
            this.isHungry = false;
            return "Thanks!";
        }
        else{
            return "I can't eat that!";
        }
    }

    public String makeSound(){
        switch (this.type) {
            case "Cow":
                return "Moo!";
            case "Pig":
                return "Oink!";
            case "Dog":
                return "Woof!";
            default:
                return "Generic Animal Sound!";
        }
    }

    public String getType() {
        return type;
    }

}
