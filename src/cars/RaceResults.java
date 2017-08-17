/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.util.Objects;

/**
 *
 * @author virtuoso
 */
public class RaceResults {

    private Car car;
    private TimeSpan timeSpan;

    public RaceResults(Car car, TimeSpan timeSpan) {
        this.car = car;
        this.timeSpan = timeSpan;
    }

    public Car getCar() {
        return car;
    }

    public TimeSpan getTimeSpan() {
        return timeSpan;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.timeSpan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RaceResults other = (RaceResults) obj;
        if (!Objects.equals(this.timeSpan, other.timeSpan)) {
            return false;
        }
        return true;
    }
    //@Override
    public int compareTo(Object o) {
        RaceResults other = (RaceResults) o;
        
        return this.timeSpan.getTotalSeconds()-other.timeSpan.getTotalSeconds();
    }
}
