package ZOO;

import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;
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
    void shouldIsHavierThan(){
        Zoo zoo = new Zoo();
        int howMany = zoo.getAnimalsOverWeigth(70);
        assertEquals(6,howMany);
    }

    @Test
    void shouldIsAliveTheBearClass(){
        Zoo zoo = new Zoo();
        boolean isAliveThat = zoo.hasAnyAlive(PolarBear.class);
        assertEquals(true, isAliveThat);
        isAliveThat=zoo.hasAnyAlive(TeddyBear.class);
        assertEquals(false,isAliveThat);
    }
}