import org.testng.annotations.Test;
import zwierzeta.Zoo;

import static org.testng.Assert.assertEquals;

public class ZooTest {
    @Test
    void ShouldGetNumberOfAllAnimalsInZoo() {
        //given
        Zoo zoo = new Zoo();
        //when
        int result = zoo.getNumberOfAllAnimals();
        //then
        assertEquals(28, zoo.getNumberOfAllAnimals());
    }

}