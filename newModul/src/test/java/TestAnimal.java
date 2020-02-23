import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestAnimal {
    @Test
    void shouldIsAliveIfEat() {
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);
        boolean isAlive = blackBear.isAlive(LocalDate.now());
        assertTrue(isAlive);
    }

    @Test
    void shouldIsAliveIfNotEat() {
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);
        boolean isAlive = blackBear.isAlive(LocalDate.now());
        assertFalse(isAlive);
    }

//    @Test
//    void shouldIsEat() {
//        LocalDate lastMeal = LocalDate.now().minusDays(5);
//        BrownBear eatBear = new BrownBear(lastMeal);
//        eatBear.eat();
//        assertEquals(LocalDate.now(), eatBear.getLastMeal());
//    }

    @Test
    void shouldIsNotEat() {
        LocalDate lastMeal = LocalDate.now().minusDays(5);
        BrownBear eatBrown = new BrownBear(lastMeal);
        assertEquals(LocalDate.now().minusDays(5), eatBrown.getLastMeal());
    }

//    @Test
//    void shouldIsPlushBearEat() {
//        TeddyBear teddyBear = new TeddyBear();
//        teddyBear.eat();
//        assertEquals(null, teddyBear.getLastMeal());
//    }

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

    @Test
    void shouldDisplayBears() {
        PolarBear polarBear = new PolarBear(LocalDate.now());
        assertEquals("I am the Polarbear with weigth 50.0. My last meal was 2020-02-16", polarBear.diplay());
        BrownBear brownBear = new BrownBear(LocalDate.now());
        assertEquals("I am the Brownbear with weigth 100.0. My last meal was 2020-02-16", brownBear.diplay());
        BlackBear blackBear = new BlackBear(LocalDate.now());
        assertEquals("I am the Blackbear with weigth 200.0. My last meal was 2020-02-16", blackBear.diplay());
        TeddyBear teddyBear = new TeddyBear();
        assertEquals("I am the Plushbear with weigth 10.0. My last meal was null", teddyBear.diplay());
    }

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
        boolean isTest = brownBear.isAlive(LocalDate.now());
        assertFalse(isTest);
        brownBear.attack(blackBear);
        boolean isTest2 = blackBear.isAlive(LocalDate.now());
        assertTrue(isTest2);
    }

}