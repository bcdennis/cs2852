package lecture09;

import lecture09.edu.msoe.se2832.travelingsalesman.MSOECommissionCalculator;
import lecture09.edu.msoe.se2832.travelingsalesman.iCommissionCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Brad on 4/12/2016.
 */
public class BinarySearchTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @DataProvider(name = "test1")
    public static Object[][] newEmployee() throws Exception {
        return new Object [][] {{new MSOECommissionCalculator("Bean", iCommissionCalculator.EXPERIENCED), "Bean"},
                                {new MSOECommissionCalculator("Ben", iCommissionCalculator.PROBATIONARY), "Ben"}};
    }

    @Test(dataProvider = "test1")
    public void testGetExperience(MSOECommissionCalculator calc, String expected) throws Exception {
        Assert.assertEquals(calc.getName(), expected);
    }
}