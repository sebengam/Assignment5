package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Attorney
{
    boolean availability;
    int calender;

    public Attorney(Builder builder)
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

        public Builder copy(Attorney attorney)
        {
            this.availability = attorney.getAvailability();
            this.calender = attorney.getCalender();
            return this;
        }

        public Attorney build ()
        {
            return new Attorney(this);
        }
    }


}
