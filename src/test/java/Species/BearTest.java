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
}