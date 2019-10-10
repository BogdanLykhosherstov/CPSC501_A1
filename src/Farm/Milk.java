package Farm;


import java.util.ArrayList;

public class Milk {
    private int numberOfLitres;
    private String type;
    private String fatContent;
    private boolean isChocolateMilk;

    public Milk(int numberOfLitres, String type, String fatContent, boolean isChocolateMilk){
        this.numberOfLitres = numberOfLitres;
        this.fatContent = fatContent;
        this.isChocolateMilk = isChocolateMilk;
        this.type = type;
    }
    public ArrayList<Object> toArray(){
        ArrayList<Object> properties = new ArrayList<>();
        properties.add(numberOfLitres);
        properties.add(type);
        properties.add(fatContent);
        properties.add(isChocolateMilk);
        return properties;
    }
}
