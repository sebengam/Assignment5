package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Advocate;

import java.util.Calendar;

/**
 * Created by student on 2016/04/03.
 */
public class AdvocateFactory
{
    public static Advocate getAdvocate(boolean availability, int calender)
    {
        Advocate myCompany = new Advocate.Builder(availability)
                .calender(calender)
                .build();
        return myCompany;

    }

}
