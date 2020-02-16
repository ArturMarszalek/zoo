
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class TestBear {
    @Test
    void shouldIsAliveIfEat() {
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);
        boolean isAlive = blackBear.isAlive();
        assertTrue(isAlive);
    }

    @Test
    void shouldIsAliveIfNotEat() {
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);
        boolean isAlive = blackBear.isAlive();
        assertFalse(isAlive);
    }

    @Test
    void shouldIsEat(){
        LocalDate lastMeal = LocalDate.now().minusDays(5);
        BrownBear eatBear = new BrownBear(lastMeal);
        eatBear.eat();
        assertEquals(LocalDate.now(),eatBear.getLastMeal());
    }

    @Test
    void shouldIsNotEat(){
        LocalDate lastMeal = LocalDate.now().minusDays(5);
        BrownBear eatBrown= new BrownBear(lastMeal);
        assertEquals(LocalDate.now().minusDays(5),eatBrown.getLastMeal());
    }

    @Test
    void shouldIsPlushBearEat(){
        PlushBear plushBear=new PlushBear();
        plushBear.eat();
        assertEquals(null, plushBear.getLastMeal());
    }

}