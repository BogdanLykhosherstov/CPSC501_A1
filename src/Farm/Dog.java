package Farm;

// 4. Lazy class - Collapse Hierarchy
public class Dog extends Animal{
    public Dog(int age, int weight){
        super(age, weight,"Dog");
    }
    public void dogSound(){
        System.out.println("Woof!");
    }
}
