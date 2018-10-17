package bsuir.webtech.firstlab.task2.Checker;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckerTest {
    Checker check = new Checker();

    @Test
    public void testCheck() {
        boolean expected = true;
        boolean actual = check.check(0,0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}