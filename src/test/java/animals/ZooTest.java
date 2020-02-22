package animals;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    public void name() {
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
        HashMap<String, Integer> result = zoo.getAnimalsCount();
        //then
        assertEquals(20, result.get("pluszak"));
        assertEquals(2, result.get("czarny niedźwiedż"));
        assertEquals(2, result.get("polarny niedźwiedż"));
        assertEquals(4, result.get("brązowy niedźwiedż"));
    }

}