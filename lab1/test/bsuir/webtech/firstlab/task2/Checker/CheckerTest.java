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

    @Test
    public void testCheck1(){
        boolean expected = true;
        boolean actual = check.check(-6, -3);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public void testCheck2(){
        boolean expected = true;
        boolean actual = check.check(4, 5);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public  void testCheck3(){
        boolean expected = false;
        boolean actual = check.check(7,0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}