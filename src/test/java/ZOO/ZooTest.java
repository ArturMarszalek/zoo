package ZOO;

import ZOO.Species.BlackBear;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
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
        HashMap<String, Integer> result = zoo.getAnimalCount();
        //then
        assertEquals(2, result.get("Black Bear"));
        assertEquals(2, result.get("Polar Bear"));
        assertEquals(4, result.get("Brown Bear"));
        assertEquals(20, result.get("Teddy Bear"));
    }

    @Test
    void shouldReturnAnimalsHeavierThan() {
        //given
        Zoo zoo = new Zoo();
        zoo.feedSpecificBeast("Black Bear");
        zoo.feedSpecificBeast("Black Bear");
        zoo.feedSpecificBeast("Black Bear");
        zoo.feedSpecificBeast("Black Bear");
        //when
        int result = zoo.getAnimalsCountWhichIsHeavierThan(15);
        //then
        assertEquals(2, result);
    }

    @Test
    void shouldReturnIfAnyOfAnimalsAreAlive() {
        //given
        Zoo zoo = new Zoo();
        //when
        //then
        assertTrue(zoo.hasAnyAlive(BlackBear.class));
    }
}