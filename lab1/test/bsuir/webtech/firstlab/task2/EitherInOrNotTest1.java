package bsuir.webtech.firstlab.task2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EitherInOrNotTest1 {
    EitherInOrNot checker = new EitherInOrNot();

    @Test
    public void testChecker() {
        boolean expected = false;
        boolean actual = checker.Checker(-6,5);
        Assert.assertEquals(actual, expected, "Wrong answer!");
        }

}
