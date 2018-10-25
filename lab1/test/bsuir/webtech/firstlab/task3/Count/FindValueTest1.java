package bsuir.webtech.firstlab.task3.Count;

//import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindValueTest1 {
    FindValue value = new FindValue();

    @Test
    public void testCountValue() {
        double expected = 0;
        double actual = value.CountValue(0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public void testCountValue1(){
        double expected = 0.5872139151569291;
        double actual = value.CountValue(-100);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

}