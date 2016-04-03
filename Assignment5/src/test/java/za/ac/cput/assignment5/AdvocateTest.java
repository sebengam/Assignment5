package za.ac.cput.assignment5;

import java.util.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Advocate;
import za.ac.cput.assignment5.Factory.AdvocateFactory;

/**
 * Created by student on 2016/04/03.
 */
public class AdvocateTest
{
    private Advocate advocate;

    @Before
    public void setUp() throws Exception
    {

        advocate = AdvocateFactory.getAdvocate(true,2016/4/3);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(advocate.getAvailability(),true);
        Assert.assertEquals(advocate.getCalender(),2016/4/3);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Advocate companyUpdate = new Advocate.Builder(advocate.getAvailability())
                .copy(advocate)
                .calender(2016/4/3)
                .build();
        Assert.assertEquals(companyUpdate.getAvailability(),true);
        Assert.assertEquals(companyUpdate.getCalender(), 2016/4/3);

    }
}
