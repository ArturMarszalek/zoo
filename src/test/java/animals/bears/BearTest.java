package animals.bears;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_pt_BR;
import org.junit.jupiter.api.Test;

import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

class BearTest {

    @Test
    void shouldGetEating(){
        //given
        Bear bear = new BlackBear();
        ZonedDateTime actualTime = ZonedDateTime.now();
        bear.getEating();
        //when
        ZonedDateTime result = bear.getLastMeal();
        //then
        assertThat(result.getDayOfMonth()).isEqualTo(actualTime.getDayOfMonth());
    }

    @Test
    void shouldIsAlife(){
        //given
        Bear bear = new BrownBear();
        bear.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(11)));
        //when
        Boolean result = bear.isAlive();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldIsAlife2(){
        //given
        Bear bear = new PolarBear();
        bear.setLastMeal(ZonedDateTime.now().minus(Period.ofDays(9)));
        //when
        Boolean result = bear.isAlive();
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
        Bear bear = new BlackBear();
        //when
        int result = bear.getWeight();
        //then
        assertThat(result).isEqualTo(50);
    }

    @Test
    void shouldgetWeightBrownBear(){
        //given
        Bear bear = new BrownBear();
        bear.getEating();
        bear.getEating();
        bear.getEating();
        bear.getEating();
        //when
        int result = bear.getWeight();
        //then
        assertThat(result).isEqualTo(120);
    }

    @Test
    void shouldgetWeightPolarBear(){
        //given
        Bear bear = new PolarBear();
        bear.getEating();
        //when
        int result = bear.getWeight();
        //then
        assertThat(result).isEqualTo(205);
    }

    @Test
    void shouldsumWeightAllBears(){
        //given
        Bear polarbear = new PolarBear();
        Bear brownbear = new BrownBear();
        Bear blackbear = new BlackBear();
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
        Bear polarbear = new PolarBear();
        //when
        String result = polarbear.display();
        //then
        assertThat(result).isEqualTo("Jestem polarny niedźwiedż");
    }

    @Test
    void shouldDisplayBlackBear(){
        //given
        Bear blackBear = new BlackBear();
        //when
        String result = blackBear.display();
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
        Bear blackBear = new BlackBear();
        Bear polarBear = new PolarBear();
        polarBear.setLastMeal(ZonedDateTime.now());
        //when
        blackBear.attack(polarBear);
        //then
        assertThat(polarBear.weight).isEqualTo(175);
        assertThat(polarBear.isAlive()).isTrue();
    }

    @Test
    void shouldAttack2(){
        //given
        Bear teddyBear = new TeddyBear();
        Bear blackBear = new BlackBear();
        //when
        blackBear.attack(teddyBear);
        //then
        assertThat(teddyBear.weight).isEqualTo(-20);
        assertThat(teddyBear.isAlive()).isFalse();
    }
}