package bsuir.webtech.firstlab.task3.Count;

import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindValueTest1 {
        MyDouble x = new MyDouble(0);
        FindValue value = new FindValue();

        @Test
        public void testCountValue() {
            double expected = 0;
            double actual = value.CountValue(x, 0.5);
            Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}