package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BronzeBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void ShouldBearEatWithinPast10Days() {
        //given
        LocalDate lastMeal = LocalDate.now();
        Bear littleBlackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = littleBlackBear.isAlive();
        //then
        assertTrue(isAlive);
    }

    @Test
    void ShouldNotBearEatWithinPast10Days() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(15);
        Bear littleBlackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = littleBlackBear.isAlive();
        //then
        assertFalse(isAlive);
    }

    @Test
    void ShouldBearEatNow() {
        //given
        Bear littleBlackBear = new BlackBear();
        //when
        littleBlackBear.eat();
        //then
        assertTrue(LocalDate.now().isEqual(littleBlackBear.getLastMeal()));
    }

    @Test
    void ShouldBearEatNowAndBeAlive() {
        //given
        Bear littleBlackBear = new BlackBear();
        //when
        littleBlackBear.eat();
        //then
        assertTrue(littleBlackBear.isAlive());
    }

    @Test
    void ShouldNotTeddyBearEat() {
        //given
        Bear teddyBear = new TeddyBear();
        //when
        teddyBear.eat();
        //then
        assertNull(teddyBear.getLastMeal());
    }

    @Test
    void TeddyBearShouldNotBeAlive() {
        //given
        Bear teddyBear = new TeddyBear();
        //when

        //then
        assertFalse(teddyBear.isAlive());
    }

    @Test
    void BlackBearShouldWeight100kg() {
        //given
        //when
        Bear blackBear = new BlackBear(50);
        //then
        assertEquals(50, blackBear.getWeight());
    }

    @Test
    void BronzeBearShouldWeight100kg() {
        //given
        //when
        Bear bronzeBear = new BlackBear(100);
        //then
        assertEquals(100, bronzeBear.getWeight());
    }

    @Test
    void PolarBearShouldWeight200kg() {
        //given
        //when
        Bear polarBear = new BlackBear(200);
        //then
        assertEquals(200, polarBear.getWeight());
    }

    @Test
    void PolarBearShouldEatAndWeight210kg() {
        //given
        //when
        Bear polarBear = new BlackBear(200);
        polarBear.eat(10);
        //then
        assertEquals(210, polarBear.getWeight());
    }

    @Test
    void PolarBearShouldEatAndNotWeight210kg() {
        //given
        //when
        Bear polarBear = new BlackBear(200);
        polarBear.eat(20);
        //then
        assertNotEquals(210, polarBear.getWeight());
    }

    @Test
    void BlackBearWeightChangeAfter3feedingTimes() {
        //given
        Bear blackBear = new BlackBear(50);
        //when
        blackBear.eat(20);
        blackBear.eat(10);
        blackBear.eat(40);
        //then
        assertEquals(120, blackBear.getWeight());
    }

    @Test
    void shouldPrintKindOfBear() {
        //given
        Bear teddyBear = new TeddyBear();
        Bear blackBear = new BlackBear();
        Bear polarBear = new PolarBear();
        Bear bronzeBear = new BronzeBear();
        //when
        //then
        assertEquals(teddyBear.display(), "I am Teddy Bear");
        assertEquals(blackBear.display(), "I am Black Bear");
        assertEquals(polarBear.display(), "I am Polar Bear");
        assertEquals(bronzeBear.display(), "I am Brown Bear");
    }

    @Test
    void PolarBearShouldKillBear() {
        //given
        Bear polarBear = new PolarBear();
        Bear teddyBear = new TeddyBear();
        //when
        polarBear.attack(teddyBear);
        //then
        assertEquals(polarBear.attack(teddyBear), "You Teddy Bear are killed by Polar Bear");
    }

    @Test
    void BlackBearShouldKillBear() {
        //given
        Bear blackBear = new BlackBear();
        Bear teddyBear = new TeddyBear();
        //when
        blackBear.attack(teddyBear);
        //then
        assertEquals(blackBear.attack(teddyBear), "You Teddy Bear are wounded by Black Bear");
    }

    @Test
    void TeddyBearShouldHugBear() {
        //given
        Bear blackBear = new BlackBear();
        Bear teddyBear = new TeddyBear();
        //when
        teddyBear.attack(blackBear);
        //then
        assertEquals(teddyBear.attack(blackBear), "You Black Bear are hugged by Teddy Bear");
    }

    @Test
    void shouldBrownBearDie() {
        //given
        Bear blackBear = new BlackBear(100);
        Bear brownBear = new BronzeBear(200);
        brownBear.eat();
        //when
        blackBear.attack(brownBear);
        blackBear.attack(brownBear);
        blackBear.attack(brownBear);
        blackBear.attack(brownBear);
        //then
        assertFalse(brownBear.isAlive());
    }

    @Test
    void shouldBearLoseWeight() {
        //given
        Bear blackBear = new BlackBear(100);
        Bear brownBear = new BronzeBear(200);
        brownBear.eat();
        //when
        blackBear.attack(brownBear);
        blackBear.attack(brownBear);
        blackBear.attack(brownBear);
        //then
        assertEquals(50, brownBear.weight);
        assertTrue(brownBear.isAlive());
    }

}