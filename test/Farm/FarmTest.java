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
    
}
