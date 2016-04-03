package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Lawyer
{
    String occupation;
    double ratePerHour;

    public Lawyer(Builder builder)
    {
        occupation = builder.occupation;
        ratePerHour = builder.ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public String getOccupation() {
        return occupation;
    }

    public static class Builder
    {
        private String occupation;
        public double ratePerHour;

        public Builder(String occupation)
        {
            this.occupation = occupation;
        }

        public Builder ratePerHour(double ratePerHour)
        {
            this.ratePerHour = ratePerHour;
            return this;
        }

        public Lawyer.Builder copy(Lawyer lawyer)
        {
            this.occupation = lawyer.getOccupation();
            this.ratePerHour = lawyer.getRatePerHour();
            return this;
        }

        public Lawyer build ()
        {
            return new Lawyer(this);
        }
    }
}
