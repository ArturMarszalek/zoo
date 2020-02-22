package animals.bears;

import org.junit.jupiter.api.Test;

import java.time.Period;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void shouldGetEating(){
        //given
        Animal animal = new BlackBear();
        ZonedDateTime actualTime = ZonedDateTime.now();
        animal.getEating();
        //when
        ZonedDateTime result = animal.getLastMeal();
        //then
        assertThat(result.getDayOfMonth()).isEqualTo(actualTime.getDayOfMonth());
    }

    @Test
    void shouldIsAlife(){
        //given
        Animal animal = new BrownBear();
        animal.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(11)));
        //when
        Boolean result = animal.isAlive();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldIsAlife2(){
        //given
        Animal animal = new PolarBear();
        animal.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(9)));
        //when
        Boolean result = animal.isAlive();
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldIsAlifeTeddyBear(){
        //given
        TeddyBear bear = new TeddyBear();
        bear.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(4)));
        //when
        Boolean result = bear.isAlive();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldFalseGetEatingTeddyBear(){
        //given
        TeddyBear bear = new TeddyBear();
        bear.getEating();
        //when
        ZonedDateTime result = bear.getLastMeal();
        //then
        assertThat(result).isNull();
    }

    @Test
    void shouldFalseGetEatingTeddyBear2(){
        //given
        TeddyBear bear = new TeddyBear();
        bear.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(4)));
        bear.getEating();
        //when
        ZonedDateTime result = bear.getLastMeal();
        //then
        assertThat(result).isNull();
    }

    @Test
    void shouldgetWeightBlackBear(){
        //given
        Animal animal = new BlackBear();
        //when
        int result = animal.getWeight();
        //then
        assertThat(result).isEqualTo(50);
    }

    @Test
    void shouldgetWeightBrownBear(){
        //given
        Animal animal = new BrownBear();
        animal.getEating();
        animal.getEating();
        animal.getEating();
        animal.getEating();
        //when
        int result = animal.getWeight();
        //then
        assertThat(result).isEqualTo(120);
    }

    @Test
    void shouldgetWeightPolarBear(){
        //given
        Animal animal = new PolarBear();
        animal.getEating();
        //when
        int result = animal.getWeight();
        //then
        assertThat(result).isEqualTo(205);
    }

    @Test
    void shouldsumWeightAllBears(){
        //given
        Animal polarbear = new PolarBear();
        Animal brownbear = new BrownBear();
        Animal blackbear = new BlackBear();
        polarbear.getEating();
        polarbear.getEating();
        brownbear.getEating();
        blackbear.getEating();
        //when
        int result = polarbear.getWeight()+ brownbear.getWeight()+blackbear.getWeight();
        //then
        assertThat(result).isEqualTo(370);
    }

    @Test
    void shouldDisplayPolarBear(){
        //given
        Animal polarbear = new PolarBear();
        //when
        String result = polarbear.display();
        //then
        assertThat(result).isEqualTo("Jestem polarny niedźwiedż");
    }

    @Test
    void shouldDisplayBlackBear(){
        //given
        Animal blackAnimal = new BlackBear();
        //when
        String result = blackAnimal.display();
        //then
        assertThat(result).isEqualTo("Jestem czarny niedźwiedż");
    }

//    @Test
//    void shouldDisplayTeddyBear(){
//        //given
//        Bear teddybear = new TeddyBear();
//        //when
//        String result = teddybear.display();
//        //then
//        assertThat(result).isEqualTo("Jestem pluszak");
//    }

//    @Test
//    void shouldDisplayattackTeddyBear(){
//        //given
//        Bear blackBear = new BlackBear();
//        Bear teddyBer = new TeddyBear();
//        //when
//        String result = blackBear.attack(teddyBer);
//        //then
//        assertThat(result).isEqualTo("Jestem czarny niedźwiedż i oszczędzam pluszak");
//    }
//
//    @Test
//    void shouldDisplayattackBlackBear(){
//        //given
//        Bear blackBear = new BlackBear();
//        Bear polarBear = new PolarBear();
//        //when
//        String result = polarBear.attack(blackBear);
//        //then
//        assertThat(result).isEqualTo("Jestem polarny niedźwiedż i zabijam czarny niedźwiedż");
//    }

    @Test
    void shouldAttack(){
        //given
        Animal blackAnimal = new BlackBear();
        Animal polarAnimal = new PolarBear();
        polarAnimal.setLastMeal(ZonedDateTime.now());
        //when
        blackAnimal.attack(polarAnimal);
        //then
        assertThat(polarAnimal.weight).isEqualTo(175);
        assertThat(polarAnimal.isAlive()).isTrue();
    }

    @Test
    void shouldAttack2(){
        //given
        Animal teddyAnimal = new TeddyBear();
        Animal blackAnimal = new BlackBear();
        //when
        blackAnimal.attack(teddyAnimal);
        //then
        assertThat(teddyAnimal.weight).isEqualTo(-20);
        assertThat(teddyAnimal.isAlive()).isFalse();
    }
}