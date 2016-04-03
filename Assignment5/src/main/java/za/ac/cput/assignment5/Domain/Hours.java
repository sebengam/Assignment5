package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Hours
{
    int hoursBooked;
    int hoursWorked;

    public Hours(Builder builder)
    {
        hoursBooked = builder.hoursBooked;
        hoursWorked = builder.hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getHoursBooked() {
        return hoursBooked;
    }

    public static class Builder
    {
        public int hoursBooked;
        public int hoursWorked;

        public Builder(int hoursBooked)
        {
            this.hoursBooked = hoursBooked;
        }

        public Builder hoursWorked(int hoursWorked)
        {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder copy(Hours hours)
        {
            this.hoursBooked = hours.getHoursBooked();

            return this;
        }

        public Hours build ()
        {
            return new Hours(this);
        }
    }
}
