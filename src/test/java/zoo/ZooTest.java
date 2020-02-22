package zoo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void ShouldGetNumberOfAllAnimalsInZoo() {
        //given
        Zoo zoo = new Zoo();
        //when
        int result = zoo.numberOfAnimals();
        //then
        assertEquals(28,result);
    }

    @Test
    void ShouldGetAnimalTypeCount() {
        //given
        Zoo zoo = new Zoo();
        //when
        HashMap<String, Integer> result = zoo.getAnimalsCount();
        //then
        assertEquals(2,result.get("BlackBear"));
        assertEquals(4,result.get("BrownBear"));
        assertEquals(2,result.get("PolarBear"));
        assertEquals(20,result.get("TeddyBear"));
    }

}