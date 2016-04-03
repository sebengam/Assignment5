package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Attorney;
import za.ac.cput.assignment5.Factory.AttorneyFactory;

/**
 * Created by student on 2016/04/03.
 */
public class AttorneyTest
{
    private Attorney attorney;

    @Before
    public void setUp() throws Exception
    {

        attorney = AttorneyFactory.getAttorney(true,2016/4/3);
    }

    @Test
    public void testAdvocate() throws Exception
    {
        Assert.assertEquals(attorney.getAvailability(),true);
        Assert.assertEquals(attorney.getCalender(),2016/4/3);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Attorney companyUpdate = new Attorney.Builder(attorney.getAvailability())
                .copy(attorney)
                .calender(2016/4/3)
                .build();
        Assert.assertEquals(companyUpdate.getAvailability(),true);
        Assert.assertEquals(companyUpdate.getCalender(), 2016/4/3);

    }
}
