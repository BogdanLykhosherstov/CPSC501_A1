package Farm;

import org.junit.*;

import static org.junit.Assert.*;

public class FarmTest {


//  Basic test to ensure Animal class constructor works
    @Test
    public void Animal_Create(){
        Animal testAnimal = new Animal(12,100,"Generic Animal");
        assertEquals("Generic Animal",testAnimal.getType());
    }
    @Test
    public void Animal_EatFood(){
        Cow testCow = new Cow(12,100);
        Pig testPig = new Pig(8,80);

        assertEquals("Thanks!", testCow.eatFood("Grass"));
        assertEquals("Thanks!", testPig.eatFood("Roots"));
    }
    @Test
    public void Animal_EatWrongFood(){
        Cow testCow = new Cow(12,100);
        assertEquals("I can't eat that!", testCow.eatFood("Roots"));

    }
    @Test
    public void Animal_MakeSound(){
        Cow testCow = new Cow(12,100);
        Pig testPig = new Pig(8,80);
        Animal testDog = new Animal(5, 50, "Dog");
        Animal testAnimal = new Animal(5,20,"Generic Animal");

        assertEquals("Moo!", testCow.makeSound());
        assertEquals("Oink!", testPig.makeSound());
        assertEquals("Woof!", testDog.makeSound());
        assertEquals("Generic Animal Sound!",testAnimal.makeSound());
    }
//    Check empty bowl, feed the pig, then check again
    @Test
    public void Pig_checkEmptyBowl(){
        Pig testPig = new Pig(8,80);

        assertFalse(testPig.isBowlEmpty());
        assertEquals("Thanks!", testPig.eatFood("Roots"));
        assertTrue(testPig.isBowlEmpty());
    }

    @Test
    public void Cow_makeMilk(){
        Cow testCow = new Cow(12,100);
        Milk milkObject = new Milk(12,"Soy","1%",false);
        assertEquals(milkObject.toArray(), testCow.makeMilk(12,"Soy","1%",false).toArray());
    }
    @Test
    public void Cow_MakeInvalidMilk(){
        Cow testCow = new Cow(12,100);
        assertNull(testCow.makeMilk(-1,"Soy","1%",false));
    }



}
