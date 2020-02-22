import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;

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
        TeddyBear teddyBear = new TeddyBear();
        teddyBear.eat();
        assertEquals(null, teddyBear.getLastMeal());
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
        TeddyBear teddyBear = new TeddyBear();
        teddyBear.eat(20);
        assertEquals(10, teddyBear.getWeight());
    }

    /*@Test
    void shouldDisplayBears() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        assertEquals("I am the Polarbear with weigth 50.0. My last meal was 2020-02-16", polarBear.diplay());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        assertEquals("I am the Brownbear with weigth 100.0. My last meal was 2020-02-16", brownBear.diplay());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        assertEquals("I am the Blackbear with weigth 200.0. My last meal was 2020-02-16", blackBear.diplay());
        PlushBear plushBear = new PlushBear();
        assertEquals("I am the Plushbear with weigth 10.0. My last meal was null", plushBear.diplay());
    }*/

    @Test
    void shouldBearAttackt() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        assertEquals("I am the Polarbear. I am killing", polarBear.displayAttack());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        assertEquals("I am the Brownbear. I am attacking", brownBear.displayAttack());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        assertEquals("I am the Blackbear. I am attacking", blackBear.displayAttack());
        TeddyBear teddyBear = new TeddyBear();
        assertEquals("I am the Plushbear. I cant attack", teddyBear.displayAttack());
    }

    @Test
    void shouldBearAttackOtherBear() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        TeddyBear teddyBear = new TeddyBear();
        assertEquals("I am the Blackbear. I am attacking Polarbear.", blackBear.attack(polarBear));
        assertEquals("I am the Brownbear. I am attacking Polarbear.", brownBear.attack(polarBear));
        assertEquals("I am the Polarbear. I am killing Brownbear.", polarBear.attack(brownBear));
        assertEquals("I cant attack.", teddyBear.attack(brownBear));
    }

    @Test
    void shouldBearAttackOtherBearIsTakingDmg() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        polarBear.attack(brownBear);
        boolean isTest = brownBear.isAlive();
        assertFalse(isTest);
        brownBear.attack(blackBear);
        boolean isTest2 = blackBear.isAlive();
        assertTrue(isTest2);
    }

    @Test
    void shouldGetNumberOfAllAnimals() {
        //given
        Zoo zoo = new Zoo();
        //when
        int getNumberOfAllAnimals = zoo.getNumberOfAllAnimals();
        //then
        assertEquals(28, getNumberOfAllAnimals);
    }

    @Test
    void shouldAddAnimals() {
        //given
        Zoo zoo = new Zoo();
        //when
        HashMap<String, Integer> result = zoo.getAnimalsCount();
        int polarBearsCount = result.get("PolarBear");
        int brownBearsCount = result.get("BrownBear");

        //then
        assertEquals(2, polarBearsCount);
        assertEquals(4, brownBearsCount);
    }

    @Test
    void zooTest() {
        //given
        Zoo zoo = new Zoo();
        //when
        HashMap<String, Integer> result = zoo.getAnimalsCount();
        int bearCount = result.get("BlackBear");
        int polarCount = result.get("PolarBear");
        int brownCount = result.get("BrownBear");
        int teddyCount = result.get("TeddyBear");
        //then
        assertEquals(2, bearCount);
        assertEquals(2, polarCount);
        assertEquals(4, brownCount);
        assertEquals(20, teddyCount);
    }
}