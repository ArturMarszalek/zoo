import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BearTest {

    @Test
    void shouldReturnTrueWhenAnimalIsAlive() {
        //given

        LocalDate lastMeal = LocalDate.now();
        Bear blackBear = new Blackbear(lastMeal);
        Bear polarBear = new PolarBear(lastMeal);

        //when
        boolean isAlive = blackBear.isAlive();
        boolean isAlive1 = polarBear.isAlive();
        //then
        Assertions.assertTrue(isAlive);
        Assertions.assertTrue(isAlive1);

    }

    @Test
    void shouldBrownBearReturnTrueWhenAlive() {
        //given
        LocalDate lastMeal = LocalDate.now();
        Bear brownBear = new BrownBear(lastMeal);
        //when
        boolean isAlive = brownBear.isAlive();
        //then
        Assertions.assertTrue(isAlive);
    }

    @Test
    void shouldReturnFalseWhenAnimalIsNotAlive() {
        //given
        LocalDate now = LocalDate.now().minusDays(11);
        Bear blackBear = new Blackbear(now);
        //when
        boolean isAlive = blackBear.isAlive();
        //then
        Assertions.assertFalse(isAlive);
    }

    @Test
    void shouldBearAteMeal() {
        //given
        LocalDate now = LocalDate.now();
        Bear blackBear = new Blackbear(now);
        //when
        blackBear.eat();
        //then
        Assertions.assertTrue(blackBear.getMealTime().isEqual(now));
    }

    @Test
    void shouldTeddyBearAteMeal() {
        //given
        LocalDate now = LocalDate.now();
        Bear teddyBear = new TeddyBear(now);
        //when
        teddyBear.eat();
        //then
        Assertions.assertNull(teddyBear.mealTime);
    }

    @Test
    void shouldBearsHadGoodWeight() {
        //given
        //when
        Bear blackBear = new Blackbear();
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
    void shouldBearsDisplayName() {
        //given
        Bear blackBear = new Blackbear();
        Bear brownBear = new BrownBear();
        Bear polarBear = new PolarBear();
        //when
        //then
        Assertions.assertEquals(blackBear.display(), "Jestem " + blackBear.getName());
        Assertions.assertEquals(brownBear.display(), "Jestem " + brownBear.getName());
        Assertions.assertEquals(polarBear.display(), "Jestem " + polarBear.getName());
    }

    @Test
    void shouldBearsAttackYou() {
        //given
        Bear blackBear = new Blackbear();
        Bear brownBear = new BrownBear();
        Bear polarBear = new PolarBear();
        //when
        //then
        Assertions.assertEquals(blackBear.attack(), "Zostales zaatakowany przez czarnego niedziweidza, ale jeszcze żyjesz!");
        Assertions.assertEquals(brownBear.attack(), "Zostales zaatakowany przez brązowego niedziweidza, ale jeszcze żyjesz!");
        Assertions.assertEquals(polarBear.attack(), "Nie masz szczescia, zostales zabity przez polarnego niedzwiedzia!");
    }
}
