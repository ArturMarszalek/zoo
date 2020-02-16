package Species;

import org.junit.Assert;
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
    void BlackBearShouldWoundYou() {
        //given
        Bear blackBear = new BlackBear();
        //when
        blackBear.attack();
        //then
        assertEquals(blackBear.attack(),"You are wounded by Bear");
    }
    @Test
    void PolarBearShouldKillYou() {
        //given
        Bear polarBear = new PolarBear();
        //when
        polarBear.attack();
        //then
        assertEquals(polarBear.attack(),"You are killed by Bear");
    }
}