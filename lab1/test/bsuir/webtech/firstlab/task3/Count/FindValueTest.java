package bsuir.webtech.firstlab.task3.Count;

import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindValueTest {
    MyDouble x = new MyDouble(1);
    FindValue value = new FindValue();


    @Test
    public void testCountValue() {
        double expected = 1.5574077246549023;
        double actual = value.CountValue(1);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

}