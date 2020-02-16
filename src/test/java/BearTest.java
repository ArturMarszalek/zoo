import bears.*;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BearTest {

    @Test
    void ShouldReturnTrueWhenBearAteAtLeast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeal);

        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertTrue(isAlive);
    }
    @Test
    void ShouldReturnFalseWhenBearDidntEatAtLeast10DaysAgo() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(11);
        BlackBear blackBear = new BlackBear(lastMeal);

        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertFalse(isAlive);
    }
    @Test
    void ShouldReturnTrueIfBearEatRightNow(){
        //given
        LocalDate eatDate = LocalDate.now();
        BlackBear blackbear = new BlackBear();

        //when
        blackbear.eat(0);

        //then
        assertTrue(blackbear.getDateOfMeal().equals(eatDate));
    }
    @Test
    void ShouldNotTeddyBearEat() {
        //given
        Bear teddyBear = new TeddyBear();
        //when
        teddyBear.eat(0);
        //then
        assertNull(teddyBear.getDateOfMeal());
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
    void ShouldAllBearsHaveDefaultWeight() {
        //given
        //when
        BlackBear blackBear = new BlackBear();
        PolarBear polarBear = new PolarBear();
        BrownBear brownBear = new BrownBear();

        //then
        assertEquals(250, polarBear.getWeight());
        assertEquals(150, blackBear.getWeight());
        assertEquals(250, polarBear.getWeight());
    }
    @Test
    void shouldAllBearsIncreaseWeightAfterMeal(){
        //given
        TeddyBear teddyBear = new TeddyBear();
        Bear polarBear = new PolarBear();
        //when
        polarBear.setWeight(250);
        polarBear.eat(1);
        //then
        assertEquals(5, teddyBear.getWeight());
        assertEquals(251, polarBear.getWeight());
    }
    @Test
    void shouldAllBearsTellTheirNames(){
        //given
        PolarBear polarBear = new PolarBear();
        TeddyBear teddyBear = new TeddyBear();
        BlackBear blackBear = new BlackBear();
        BrownBear brownBear = new BrownBear();
        //when
        polarBear.setName("JACEK");
        teddyBear.setName("JACEK");
        blackBear.setName("JACEK");
        brownBear.setName("JACEK");
        polarBear.display();
        blackBear.display();
        brownBear.display();
        teddyBear.display();
        //then
        assertEquals(polarBear.display(), "Jestem: JACEK");
        assertEquals(teddyBear.display(), "Jestem: JACEK");
        assertEquals(brownBear.display(), "Jestem: JACEK");
        assertEquals(blackBear.display(), "Jestem: JACEK");

    }
    @Test
    void shouldAllBearsAttackProperly(){
        //given
        TeddyBear teddyBear = new TeddyBear();
        Bear polarBear = new PolarBear();
        Bear blackBear = new BlackBear();
        //when
        //then
        assertEquals("Zaatakowałeś i zraniłeś przeciwnika", blackBear.attack());
        assertEquals("Zaatakowałeś i zabiłeś przeciwnika przeciwnika", polarBear.attack());
        assertEquals("Zaatakowałeś i gówno zrobiłeś bo jesteś pluszakiem", teddyBear.attack());

    }
}
