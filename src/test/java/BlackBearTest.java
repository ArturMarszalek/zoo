import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BlackBearTest {

    @Test
    void shouldReturnTrueWhenBearAteAtLeastInLast10Days() {
        //given
        LocalDate lastMeat = LocalDate.now();
        BlackBear blackBear = new BlackBear(lastMeat);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenBearDidNotEatInLast10Days() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(10);
        BlackBear blackBear = new BlackBear(lastMeal);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        assertFalse(isAlive);
    }

//    @Test
//    void shouldIncreaseWeightOfBearDuringMeal() {
//        //given
//        BlackBear blackBear = new BlackBear();
//        //when
//        blackBear.eat(5);
//        //then
//        assertEquals(105, blackBear.getWeight());
//    }


    @Test
    void shouldAllBearHaveDefaultWeights() {
        //given
        //when
        //then
        assertEquals(200,  new PolarBear().getWeight());
        assertEquals(100, new BlackBear().getWeight());
        assertEquals(150, new BrownBear().getWeight());
        assertEquals(5, new TeddyBear().getWeight());
    }

    @Test
    void shouldDoNothingOnEating() {
        //given
        Bear teddyBear = new TeddyBear();
        assertEquals(5, teddyBear.getWeight());
        //when
        teddyBear.eat(100);
        //then
        assertEquals(5, teddyBear.getWeight());
    }

    @Test
    void shouldIncreaseWeightOnEating() {
        //given
        Bear teddyBear = new BlackBear();
        assertEquals(100, teddyBear.getWeight());
        //when
        teddyBear.eat(33);
        //then
        assertEquals(133, teddyBear.getWeight());
    }

    @Test
    void shouldBearDisplay() {
        //given
        TeddyBear teddyBear = new TeddyBear();
        BlackBear blackBear = new BlackBear();
        BrownBear brownBear = new BrownBear();
        PolarBear polarBear = new PolarBear();
        //when
        teddyBear.display();
        blackBear.display();
        brownBear.display();
        polarBear.display();
        //then
        assertEquals("Jestem pluszowy", teddyBear.display());
        assertEquals("Jestem czarny", blackBear.display());
        assertEquals("Jestem brazowy", brownBear.display());
        assertEquals("Jestem polarny", polarBear.display());
    }

    @Test
    void shouldBearAttack() {
        //given
        TeddyBear teddyBear = new TeddyBear();
        BlackBear blackBear = new BlackBear();
        BrownBear brownBear = new BrownBear();
        PolarBear polarBear = new PolarBear();
        //when
        teddyBear.attack(blackBear);
        blackBear.attack(brownBear);
        brownBear.attack(polarBear);
        polarBear.attack(teddyBear);
        //then
        assertEquals("Ja pluszowy glaszcze czarny", teddyBear.attack(blackBear));
        assertEquals("Ja czarny zabijam brazowy", blackBear.attack(brownBear));
        assertEquals("Ja brazowy zabijam polarny", brownBear.attack(polarBear));
        assertEquals("Ja polarny sciskam pluszowy", polarBear.attack(teddyBear));
    }
}