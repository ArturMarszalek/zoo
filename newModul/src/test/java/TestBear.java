
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
    void shouldIsEat() {
        LocalDate lastMeal = LocalDate.now().minusDays(5);
        BrownBear eatBear = new BrownBear(lastMeal);
        eatBear.eat();
        assertEquals(LocalDate.now(), eatBear.getLastMeal());
    }

    @Test
    void shouldIsNotEat() {
        LocalDate lastMeal = LocalDate.now().minusDays(5);
        BrownBear eatBrown = new BrownBear(lastMeal);
        assertEquals(LocalDate.now().minusDays(5), eatBrown.getLastMeal());
    }

    @Test
    void shouldIsPlushBearEat() {
        PlushBear plushBear = new PlushBear();
        plushBear.eat();
        assertEquals(null, plushBear.getLastMeal());
    }

    @Test
    void shouldGetWeightWorkingGood() {
        LocalDate lastMeal = LocalDate.now();
        BrownBear brownBear = new BrownBear(lastMeal);
        assertEquals(100, brownBear.getWeight());
        BlackBear blackBear = new BlackBear(lastMeal);
        assertEquals(200, blackBear.getWeight());
        PolarBear polarBear = new PolarBear(lastMeal);
        assertEquals(50, polarBear.getWeight());
        polarBear.eat(5);
        assertEquals(55, polarBear.getWeight());
    }

    @Test
    void shouldGetWeigthAfterEat() {
        PolarBear polarBear = new PolarBear();
        polarBear.eat(5);
        assertEquals(55, polarBear.getWeight());
        BrownBear brownBear = new BrownBear();
        brownBear.eat(20);
        assertEquals(120, brownBear.getWeight());
        BlackBear blackBear = new BlackBear();
        blackBear.eat(50);
        assertEquals(250, blackBear.getWeight());
        PlushBear plushBear = new PlushBear();
        plushBear.eat(20);
        assertEquals(10, plushBear.getWeight());
    }

    @Test
    void shouldDisplayBears() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        assertEquals("I am the Polarbear with weigth 50. My last meal was 2020-02-16", polarBear.diplay());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        assertEquals("I am the Brownbear with weigth 100. My last meal was 2020-02-16", brownBear.diplay());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        assertEquals("I am the Blackbear with weigth 200. My last meal was 2020-02-16", blackBear.diplay());
        PlushBear plushBear = new PlushBear();
        assertEquals("I am the Plushbear with weigth 10. My last meal was null", plushBear.diplay());
    }

    @Test
    void shouldBearAttackt() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        assertEquals("I am the Polarbear. I am killing", polarBear.attack());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        assertEquals("I am the Brownbear. I am attacking", brownBear.attack());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        assertEquals("I am the Blackbear. I am attacking", blackBear.attack());
        PlushBear plushBear = new PlushBear();
        assertEquals("I am the Plushbear. null", plushBear.attack());
    }

    @Test
    void shouldBearAttackOtherBear() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        PlushBear plushBear = new PlushBear();
        assertEquals("I am the Blackbear. I am attacking Polarbear.", blackBear.attack(polarBear));
        assertEquals("I am the Brownbear. I am attacking Polarbear.", brownBear.attack(polarBear));
        assertEquals("I am the Polarbear. I am killing Brownbear.", polarBear.attack(brownBear));
        assertEquals("I cant attack.", plushBear.attack(brownBear));
    }
}