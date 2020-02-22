import bear.Zoo;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void ShouldReturnNumberOfTeddyBears() {
        //given
        Zoo zoo = new Zoo();
        //when
        Map<String, Integer> result =  zoo.getAnimalsCount();
        //then
        assertEquals(20, result.get("TeddyBear"));
        assertEquals(2, result.get("PolarBear"));
        assertEquals(2, result.get("BlackBear"));
        assertEquals(4, result.get("BrownBear"));
    }
}
