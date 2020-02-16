
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

    @Test
    void shouldGetWeightWorkingGood(){
        LocalDate lastMeal = LocalDate.now();
        BrownBear brownBear = new BrownBear(lastMeal);
        assertEquals(100,brownBear.getWeight());
        BlackBear blackBear = new BlackBear(lastMeal);
        assertEquals(200,blackBear.getWeight());
        PolarBear polarBear=new PolarBear(lastMeal);
        assertEquals(50,polarBear.getWeight());
        polarBear.eat(5);
        assertEquals(55,polarBear.getWeight());
    }
    @Test
    void shouldGetWeigthAfterEat(){
        PolarBear polarBear=new PolarBear();
        polarBear.eat(5);
        assertEquals(55,polarBear.getWeight());
        BrownBear brownBear=new BrownBear();
        brownBear.eat(20);
        assertEquals(120,brownBear.getWeight());
        BlackBear blackBear= new BlackBear();
        blackBear.eat(50);
        assertEquals(250, blackBear.getWeight());
        PlushBear plushBear = new PlushBear();
        plushBear.eat(20);
        assertEquals(0, plushBear.getWeight());
    }
}