package za.ac.cput.assignment5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment5.Domain.Lawyer;
import za.ac.cput.assignment5.Factory.LawyerFactory;

/**
 * Created by student on 2016/04/03.
 */
public class LawyerTest
{
    private Lawyer lawyer;

    @Before
    public void setUp() throws Exception
    {

        lawyer = LawyerFactory.getLawyer("Advocate",2000);
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(lawyer.getOccupation(),"Advocate");
        Assert.assertEquals(lawyer.getRatePerHour(),2000.65);



    }

    @Test
    public void testNewUpdate() throws Exception {
        Lawyer lawyerUpdate = new Lawyer.Builder(lawyer.getOccupation())
                .copy(lawyer)
                .ratePerHour(2000)
                .build();
        Assert.assertEquals(lawyerUpdate.getOccupation(),"Advocate");
        Assert.assertEquals(lawyerUpdate.getRatePerHour(), 2000.65);

    }
}
