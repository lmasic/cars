/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author virtuoso
 */
public class TimeSpan {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public TimeSpan() {
    }

    public void setHour(int hour) {

        if (hour < 24) {
            this.hour = hour;
        }
    }

    public TimeSpan(TimeSpan ts) {
        this.second = ts.getSecond();
        this.minute = ts.getMinute();
        this.hour = ts.getHour();
    }

    public int hashCode() {

        return getTotalSeconds();
    }

    public void setTime(int hour, int minute, int second) {
        if (second >= 60 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
        if (minute >= 60 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }

        if (this.hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public TimeSpan(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public TimeSpan(int second) {
        this(second / 60, second % 60);
    }

    public TimeSpan(int minute, int second) {
        this(minute / 60, minute % 60, second);
    }

    public int getTotalSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public TimeSpan add(int second) {
        int addMinute = 0;
        int addHour = 0;
        addMinute = (this.second + second) / 60;
        addHour = addMinute / 60;
        addMinute = addMinute % 60;
        this.second = (this.second + second) % 60;
        this.minute += addMinute;
        this.hour += addHour;
        return this;
    }

    @Override
    public String toString() {
        return hour + " hours " + minute + " minutes " + second + " seconds";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final TimeSpan other = (TimeSpan) obj;
        if (this.getTotalSeconds() != other.getTotalSeconds()) {
            return false;
        }
        return true;
    }

}
