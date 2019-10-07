package Farm;

public class Animal {


    private int age;
    private int weight;
    private String type;
    //1. Duplicate Method in subclasses:
    // - change isHungry to private, implement eatFood method in Animal
    public boolean isHungry;
    private String whoToFollow;

    public Animal(int age, int weight, String type){
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.isHungry = false;

    }
    public String getType() {
        return type;
    }


    // 5. Speculative Generality - Remove method that was added for future expansion that never occurred.
    // - remove method
    // TODO : add farmer class for aggregation of animals and running the farm

    public void followFarmer(String farmerName){
        this.whoToFollow = farmerName;
    }

}
