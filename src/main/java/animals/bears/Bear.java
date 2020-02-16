package animals.bears;

import animals.Animal;
import java.time.Period;
import java.time.ZonedDateTime;

public class Bear extends Animal {

    ZonedDateTime lastEatingTime;

    public Bear(ZonedDateTime lastEatingTime) {
        this.lastEatingTime = lastEatingTime;
    }

    public Bear() {
    }

    public ZonedDateTime getEating(){

        lastEatingTime = ZonedDateTime.now();

        return lastEatingTime;
    }

    public boolean isAlive(){
        ZonedDateTime actualTime = ZonedDateTime.now();
        if (actualTime.minus(Period.ofDays(10)).isAfter(lastEatingTime)){
            return false;
        }
        return true;
    }

    public ZonedDateTime getLastEatingTime() {
        return lastEatingTime;
    }

    public void setLastEatingTime(ZonedDateTime lastEatingTime) {
        this.lastEatingTime = lastEatingTime;
    }
}
