import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ZooTest {


    @Test
    void ShouldGetNumberOfAllAnimalsInZoo() {
        //given
        Zoo zoo = new Zoo();
        //when
        int result = zoo.getNumberOfAllAnimals();
        //then
        assertEquals(28, result);
    }

    @Test
    void ShouldReturnNubmerOfTeddyBears() {
        //given
        Zoo zoo = new Zoo();
        //when
        Map<String, Integer> result = zoo.getAnimalsCount();
        //then
        assertEquals(20, result.get("Teddy"));
        assertEquals(2, result.get("Polar"));
        assertEquals(2, result.get("Black"));
        assertEquals(4, result.get("Brown"));
    }
}