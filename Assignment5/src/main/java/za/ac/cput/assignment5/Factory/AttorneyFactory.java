package za.ac.cput.assignment5.Factory;

import za.ac.cput.assignment5.Domain.Attorney;

/**
 * Created by student on 2016/04/03.
 */
public class AttorneyFactory
{
    public static Attorney getAttorney(boolean availability, int calender)
    {
        Attorney myAttorney = new Attorney.Builder(availability)
                .calender(calender)
                .build();
        return myAttorney;

    }
}
