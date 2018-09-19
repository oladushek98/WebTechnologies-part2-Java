package bsuir.webtech.firstlab.task2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EitherInOrNotTest {
    EitherInOrNot checker = new EitherInOrNot();

    @Test
    public void testChecker() {
        boolean expected = true;
        boolean actual = checker.Checker(0,0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

}