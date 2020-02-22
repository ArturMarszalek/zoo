import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BlackAnimalTest {

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
        Animal teddyBear = new TeddyBear();
        assertEquals(5, teddyBear.getWeight());
        //when
        teddyBear.eat(100);
        //then
        assertEquals(5, teddyBear.getWeight());
    }

    @Test
    void shouldIncreaseWeightOnEating() {
        //given
        Animal teddyBear = new BlackBear();
        assertEquals(100, teddyBear.getWeight());
        //when
        teddyBear.eat(33);
        //then
        assertEquals(133, teddyBear.getWeight());
    }
}