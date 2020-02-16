import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zwierzeta.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BlackBearTest {
    @Test
    void shouldReturnTrueWhenBearAteAtLast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenBearDidNotAteAtLast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertFalse(isAlive);
    }

    @Test
    void shouldGetEating() {
        //given
        LocalDate now = LocalDate.now();
        Bear blackBear = new BlackBear(now);
        //when
        blackBear.eat();
        //then
        Assertions.assertTrue(blackBear.getMealTime().isEqual(now));

    }

    @Test
    void shouldTeddyBearEat() {
        //given
        LocalDate now = LocalDate.now();
        Bear teddyBear = new TeddyBear();
        //when
        teddyBear.eat();
        //then
        Assertions.assertNull(teddyBear.getMealTime());
    }

    @Test
    void shouldAllBearHaveDefaultWeight() {
        //given
        //given
        Bear blackBear = new BlackBear();
        Bear polarBear = new PolarBear();
        //then
        assertEquals(200, polarBear.getWeight());
        assertEquals(50, blackBear.getWeight());
    }

    @Test
    void shouldDoNOtEatNothing() {
        Bear blackBear = new BlackBear();
        Bear brownBear = new BrownBear();
        Bear polarBear = new PolarBear();
        blackBear.eat();
        brownBear.eat();
        polarBear.eat();
        //then
        Assertions.assertEquals(50, blackBear.getWeight());
        Assertions.assertEquals(100, brownBear.getWeight());
        Assertions.assertEquals(200, polarBear.getWeight());
    }

    @Test
    void shouldPrintKindOfBear() {
        //given

        Bear blackBear = new BlackBear();
        Bear polarBear = new PolarBear();
        Bear bronzeBear = new BrownBear();
        //when
        //then
        assertEquals(blackBear.display(), "jestem niedzwiedziem Czarnym");
        assertEquals(polarBear.display(), "jestem niedzwiedziem Polarnym");
        assertEquals(bronzeBear.display(), "jestem niedzwiedziem Brunatnym");
    }

    @Test
    void shouldBearAttack() {
        //given
        Bear blackBear = new BlackBear();
        Bear polarBear = new PolarBear();
        Bear brownBear = new BrownBear();
        //when
        polarBear.Attack(blackBear);
        blackBear.Attack(brownBear);
        brownBear.Attack(polarBear);
        //then
        assertEquals("Ja Czarnym zatakuje Brunatnym", blackBear.Attack(brownBear));
        assertEquals("Ja Brunatnym atakujePolarnym", brownBear.Attack(polarBear));
        assertEquals("Ja Polarnym zabijam Czarnym", polarBear.Attack(blackBear));
    }

}