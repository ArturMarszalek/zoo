package animals.bears;

import org.junit.jupiter.api.Test;

import java.time.Period;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class BearTest {

    @Test
    void shouldGetEating(){
        //given
        Bear bear = new Bear();
        ZonedDateTime actualTime = ZonedDateTime.now();
        //when
        ZonedDateTime result = bear.getEating();
        //then
        assertThat(result.getDayOfMonth()).isEqualTo(actualTime.getDayOfMonth());
    }

    @Test
    void shouldIsAlife(){
        //given
        Bear bear = new Bear();
        bear.setLastEatingTime(ZonedDateTime.now().minus(Period.ofDays(11)));
        //when
        Boolean result = bear.isAlive();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldIsAlife2(){
        //given
        Bear bear = new Bear();
        bear.setLastEatingTime(ZonedDateTime.now().minus(Period.ofDays(9)));
//        ZonedDateTime actualTime = ZonedDateTime.now().plus(Period.ofDays(9));
        //when
        Boolean result = bear.isAlive();
        //then
        assertThat(result).isTrue();
    }

}