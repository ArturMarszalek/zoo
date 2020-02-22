import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {


    @Test
    void ShouldGetAnimalsCountAndTypes() {
        //given
        Zoo zoo = new Zoo();
        //when
        int result = zoo.getNumberOfAllAnimals();
        //then
        assertEquals(28, result);
    }
    @Test
    void ShouldReturnNubmerOfAllKindsOfBears() {
        //given
        Zoo zoo = new Zoo();
        //when
        HashMap<String, Integer> result = zoo.getAnimalCount();
        //then
        assertEquals(20, result.get("TeddyBear"));
        assertEquals(2, result.get("PolarBear"));
        assertEquals(2, result.get("BlackBear"));
        assertEquals(4, result.get("BrownBear"));
    }
}
