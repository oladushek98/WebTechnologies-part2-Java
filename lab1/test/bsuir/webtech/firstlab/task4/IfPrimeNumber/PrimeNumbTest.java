package bsuir.webtech.firstlab.task4.IfPrimeNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrimeNumbTest {
    PrimeNumb prime = new PrimeNumb();

    @Test
    public void testIfPrime() {
        boolean expected = true;
        boolean actual = prime.IfPrime(5);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public void testfPrime1(){
        boolean expected = false;
        boolean actual = prime.IfPrime(0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}