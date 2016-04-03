package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Booking
{
    private Company company;
    private Person person;
    private Boolean availability;

    public Booking (Builder builder)
    {
        company = builder.company;
        person = builder.person;
        availability = builder.availability;
    }

    public Company getCompany() {
        return company;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public Person getPerson() {
        return person;
    }

    public static class Builder
    {
        private Company company;
        private Person person;
        private Boolean availability;

        public Builder (boolean availability)
        {
            this.availability = availability;
        }

        public Builder company(Company company)
        {
            this.company = company;
            return this;
        }

        public Builder person(Person person)
        {
            this.person = person;
            return this;
        }

        public Builder copy(Booking booking)
        {
            this.availability = booking.getAvailability();
            this.company = booking.getCompany();
            this.person = booking.getPerson();

            return this;
        }

        public Booking build()
        {
            return new Booking(this);
        }

    }
}
