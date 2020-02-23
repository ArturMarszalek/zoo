package ZOO;

import ZOO.Species.BlackBear;
import ZOO.Species.BrownBear;
import ZOO.Species.PolarBear;
import ZOO.Species.TeddyBear;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    @Test
    void ShouldNotBearEatWithinPast10Days() {
        //given
        LocalDate lastMeal = LocalDate.now().minusDays(15);
        Animal littleBlackAnimal = new BlackBear(lastMeal);
        //when
        boolean isAlive = littleBlackAnimal.isAlive(LocalDate.now());
        //then
        assertFalse(isAlive);
    }

    @Test
    void ShouldBearEatNow() {
        //given
        Animal littleBlackAnimal = new BlackBear();
        //when
        littleBlackAnimal.eat();
        //then
        assertTrue(LocalDate.now().isEqual(littleBlackAnimal.getLastMeal()));
    }

    @Test
    void ShouldBearEatNowAndBeAlive() {
        //given
        Animal littleBlackAnimal = new BlackBear();
        //when
        littleBlackAnimal.eat(5);
        //then
        assertTrue(littleBlackAnimal.isAlive(LocalDate.now()));
    }

    @Test
    void ShouldNotTeddyBearEat() {
        //given
        Animal teddyAnimal = new TeddyBear();
        //when
        teddyAnimal.eat();
        //then
        assertNull(teddyAnimal.getLastMeal());
    }

    @Test
    void TeddyBearShouldNotBeAlive() {
        //given
        Animal teddyAnimal = new TeddyBear();
        //when

        //then
        assertFalse(teddyAnimal.isAlive(LocalDate.now()));
    }

    @Test
    void BlackBearShouldWeight100kg() {
        //given
        //when
        Animal blackAnimal = new BlackBear(50);
        //then
        assertEquals(50, blackAnimal.getWeight());
    }

    @Test
    void BronzeBearShouldWeight100kg() {
        //given
        //when
        Animal bronzeAnimal = new BlackBear(100);
        //then
        assertEquals(100, bronzeAnimal.getWeight());
    }

    @Test
    void PolarBearShouldWeight200kg() {
        //given
        //when
        Animal polarAnimal = new BlackBear(200);
        //then
        assertEquals(200, polarAnimal.getWeight());
    }

    @Test
    void PolarBearShouldEatAndWeight210kg() {
        //given
        //when
        Animal polarAnimal = new BlackBear(200);
        polarAnimal.eat(10);
        //then
        assertEquals(210, polarAnimal.getWeight());
    }

    @Test
    void PolarBearShouldEatAndNotWeight210kg() {
        //given
        //when
        Animal polarAnimal = new BlackBear(200);
        polarAnimal.eat(20);
        //then
        assertNotEquals(210, polarAnimal.getWeight());
    }

    @Test
    void BlackBearWeightChangeAfter3feedingTimes() {
        //given
        Animal blackAnimal = new BlackBear(50);
        //when
        blackAnimal.eat(20);
        blackAnimal.eat(10);
        blackAnimal.eat(40);
        //then
        assertEquals(120, blackAnimal.getWeight());
    }

    @Test
    void shouldPrintKindOfBear() {
        //given
        Animal teddyAnimal = new TeddyBear();
        Animal blackAnimal = new BlackBear();
        Animal polarAnimal = new PolarBear();
        Animal bronzeAnimal = new BrownBear();
        //when
        //then
        assertEquals(teddyAnimal.display(), "I am Teddy Bear");
        assertEquals(blackAnimal.display(), "I am Black Bear");
        assertEquals(polarAnimal.display(), "I am Polar Bear");
        assertEquals(bronzeAnimal.display(), "I am Brown Bear");
    }

    @Test
    void PolarBearShouldKillBear() {
        //given
        Animal polarAnimal = new PolarBear();
        Animal teddyAnimal = new TeddyBear();
        //when
        polarAnimal.attack(teddyAnimal);
        //then
        assertEquals(polarAnimal.attack(teddyAnimal), "You Teddy Bear are killed by Polar Bear");
    }

    @Test
    void BlackBearShouldKillBear() {
        //given
        Animal blackAnimal = new BlackBear();
        Animal teddyAnimal = new TeddyBear();
        //when
        blackAnimal.attack(teddyAnimal);
        //then
        assertEquals(blackAnimal.attack(teddyAnimal), "You Teddy Bear are wounded by Black Bear");
    }

    @Test
    void TeddyBearShouldHugBear() {
        //given
        Animal blackAnimal = new BlackBear();
        Animal teddyAnimal = new TeddyBear();
        //when
        teddyAnimal.attack(blackAnimal);
        //then
        assertEquals(teddyAnimal.attack(blackAnimal), "You Black Bear are hugged by Teddy Bear");
    }

    @Test
    void shouldBrownBearDie() {
        //given
        Animal blackAnimal = new BlackBear(100);
        Animal brownAnimal = new BrownBear(200);
        brownAnimal.eat();
        //when
        blackAnimal.attack(brownAnimal);
        blackAnimal.attack(brownAnimal);
        blackAnimal.attack(brownAnimal);
        blackAnimal.attack(brownAnimal);
        //then
        assertFalse(brownAnimal.isAlive(LocalDate.now()));
    }

    @Test
    void shouldBearLoseWeight() {
        //given
        Animal blackAnimal = new BlackBear(100);
        Animal brownAnimal = new BrownBear(200);
        brownAnimal.eat();
        //when
        blackAnimal.attack(brownAnimal);
        blackAnimal.attack(brownAnimal);
        blackAnimal.attack(brownAnimal);
        //then
        assertEquals(50, brownAnimal.weight);
        assertTrue(brownAnimal.isAlive(LocalDate.now()));
    }

    @Test
    void shouldBearDie() {
        //given
        Animal polarAnimal = new PolarBear(100);
        Animal brownAnimal = new BrownBear(200);
        brownAnimal.eat();
        //when
        polarAnimal.attack(brownAnimal);
        //then
        assertFalse(brownAnimal.isAlive(LocalDate.now()));
    }

    @Test
    void shouldBearDoNothing() {
        //given
        Animal teddyAnimal = new TeddyBear(100);
        Animal brownAnimal = new BrownBear(200);
        brownAnimal.eat();
        //when
        teddyAnimal.attack(brownAnimal);
        //then
        assertTrue(brownAnimal.isAlive(LocalDate.now()));
        assertEquals(200, brownAnimal.weight);
    }


}