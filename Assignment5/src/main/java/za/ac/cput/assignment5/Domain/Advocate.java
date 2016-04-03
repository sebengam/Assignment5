package za.ac.cput.assignment5.Domain;

import java.util.Calendar;

/**
 * Created by student on 2016/04/03.
 */
public class Advocate
{
    boolean availability;
    int calender;

    public Advocate(Builder builder)
    {
        availability = builder.availability;
        calender = builder.calender;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public int getCalender() {
        return calender;
    }
    public static class Builder
    {

        private boolean availability;
        public int calender;

        public Builder (boolean availability)
        {
            this.availability = availability;
        }
        public Builder calender(int calender)
        {
            this.calender = calender;
            return this;
        }

        public Builder copy(Advocate advocate)
        {
            this.availability = advocate.getAvailability();
            this.calender = advocate.getCalender();
            return this;
        }

        public Advocate build ()
        {
            return new Advocate(this);
        }
    }


}
